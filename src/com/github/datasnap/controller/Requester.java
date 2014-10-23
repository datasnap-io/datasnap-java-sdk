package com.github.datasnap.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.datasnap.events.IEvent;
import com.github.datasnap.eventthreading.EventListBatchObject;
import com.github.datasnap.stats.DsClientStats;
import com.github.datasnap.tests.Merge;
import com.github.datasnap.utils.Defaults;

// a blocking requester

public class Requester {

	private static final Logger logger = LoggerFactory
			.getLogger(Defaults.LOGGER);
	protected DataSnapClient client;
	private CloseableHttpClient httpClient;
	private RequestConfig defaultRequestConfig;

	public Requester(DataSnapClient client) {
		this.client = client;
		httpClient = HttpClients.createDefault();
		int requestTimeout = client.getOptions().getTimeout();

		defaultRequestConfig = RequestConfig.custom()
				.setCookieSpec(CookieSpecs.BEST_MATCH)
				.setExpectContinueEnabled(true)
				.setStaleConnectionCheckEnabled(true)
				.setSocketTimeout(requestTimeout)
				.setConnectTimeout(requestTimeout)
				.setConnectionRequestTimeout(requestTimeout)
				.setProxy(client.getOptions().getProxy()).build();
	}

	public boolean send(EventListBatchObject eventListBatchObject) {
		DsClientStats statistics = client.getStatistics();
		try {
			long start = System.currentTimeMillis();

			// mark that the event is getting sent now
			eventListBatchObject.setSentAt(DateTime.now());

			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Inclusion.NON_NULL);
			for(IEvent ev: eventListBatchObject.getBatch()){
			Map<String, Object> additional = ev.getAdditionalProperties();

			IEvent e = eventListBatchObject.getBatch().get(0);
			e.getAdditionalProperties();

			String jsonAdd = mapper.writeValueAsString(additional);
			String jsonEvent = mapper.writeValueAsString(e);

			JSONObject jsonAddObj = new JSONObject(jsonAdd);
			JSONObject JsonEventObj = new JSONObject(jsonEvent);
			JSONObject finalJson = Merge.deepMerge(jsonAddObj, JsonEventObj);
			mapper.setSerializationInclusion(Inclusion.NON_NULL);

			mapper.setPropertyNamingStrategy(
				    PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
			
			
			System.out.println(finalJson);
			String finalJsonString = mapper.writeValueAsString(e);

			HttpResponse response = executeRequest(finalJsonString);
			String responseBody = readResponseBody(response);
			int statusCode = response.getStatusLine().getStatusCode();

			long duration = System.currentTimeMillis() - start;
			statistics.updateRequestTime(duration);

			if (statusCode == 200) {
				logger.debug(
						"Successful analytics request. [code = {}]. Response = {}",
						statusCode, responseBody);
				succeed(eventListBatchObject, statistics);
				return true;
			} else {
				logger.error(
						"Failed analytics response [code = {}]. Response = {}",
						statusCode, responseBody);
				fail(eventListBatchObject, statistics);
			}
		} }catch (IOException e) {
			logger.error("Failed analytics response. [error = {}]",
					e.getMessage());
			fail(eventListBatchObject, statistics);
		} 

		return false;
	}

	public HttpResponse executeRequest(String json)
			throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(client.getOptions().getHost());
		post.setHeader("Content-Type", "application/json");
		post.addHeader("Authorization",
				"Basic E9NZuB6A91e2J03PKA2g7wx0629czel8");
		post.setConfig(defaultRequestConfig);
		StringEntity se = new StringEntity(json);
		post.setEntity(se);
		if (logger.isTraceEnabled()) {
			logger.trace("Posting analytics data");
		}
		return httpClient.execute(post);
	}

	public String readResponseBody(HttpResponse response) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));
		StringBuilder responseBuilder = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			responseBuilder.append(line);
		}
		String responseBody = responseBuilder.toString();
		return responseBody;
	}

	private void succeed(EventListBatchObject eventListBatchObject,
			DsClientStats statistics) {
		for (IEvent payload : eventListBatchObject.getBatch()) {
			statistics.updateSuccessful(1);
		}
	}

	private void fail(EventListBatchObject eventListBatchObject,
			DsClientStats statistics) {
		for (IEvent payload : eventListBatchObject.getBatch()) {
			statistics.updateFailed(1);
		}
	}

	public void close() {
		try {
			httpClient.close();
		} catch (IOException e) {
			logger.error("Error while closing", e);
		}
	}

}
