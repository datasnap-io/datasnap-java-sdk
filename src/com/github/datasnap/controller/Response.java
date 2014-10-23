package com.github.datasnap.controller;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.map.ObjectMapper;

public  class Response {
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private String status;
    private String error;
    @JsonTypeInfo(include = As.WRAPPER_OBJECT, use = Id.CLASS)
    private Object data;
    
    public Response(String string, String string2, MyClass myClass) {
    	setStatus(string);
    	setError(string2);
    	setData(myClass);
    	
	}

	public Response(String string, String string2, int i) {
		setStatus(string);
    	setError(string2);
    	setData(i);	}

	public Response(String string, String string2, String string3) {
		setStatus(string);
    	setError(string2);
    	setData(string3);	}

	public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Response r1 = new Response("Status", "An error", "some data");
        Response r2 = new Response("Status", "An error", 10);
        Response r3 = new Response("Status", "An error", new MyClass("data"));
        System.out.println(mapper.writeValueAsString(r1));
        System.out.println(mapper.writeValueAsString(r2));
        System.out.println(mapper.writeValueAsString(r3));
    }

    @JsonAutoDetect(fieldVisibility=Visibility.ANY)
    public static class MyClass{
        private String data;
        public MyClass(String data) {
            this.data = data;
        }
    }
}