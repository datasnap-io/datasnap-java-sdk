
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Campaign {

    /**
     * 
     */
    private List<String> communicationIds = new ArrayList<String>();
    /**
     * 
     */
    private String id;
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private List<Subcampaign> subcampaigns = new ArrayList<Subcampaign>();
    /**
     * 
     */
    private List<String> tags = new ArrayList<String>();
    /**
     * 
     */
    private TargetingRules targetingRules;
    /**
     * 
     */
    private TimeFilter timeFilter;
    /**
     * 
     */
    private TimeTrigger timeTrigger;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public List<String> getCommunicationIds() {
        return communicationIds;
    }

    /**
     * 
     */
    public void setCommunicationIds(List<String> communicationIds) {
        this.communicationIds = communicationIds;
    }

    public Campaign withCommunicationIds(List<String> communicationIds) {
        this.communicationIds = communicationIds;
        return this;
    }

    /**
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public Campaign withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Campaign withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     */
    public List<Subcampaign> getSubcampaigns() {
        return subcampaigns;
    }

    /**
     * 
     */
    public void setSubcampaigns(List<Subcampaign> subcampaigns) {
        this.subcampaigns = subcampaigns;
    }

    public Campaign withSubcampaigns(List<Subcampaign> subcampaigns) {
        this.subcampaigns = subcampaigns;
        return this;
    }

    /**
     * 
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Campaign withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     */
    public TargetingRules getTargetingRules() {
        return targetingRules;
    }

    /**
     * 
     */
    public void setTargetingRules(TargetingRules targetingRules) {
        this.targetingRules = targetingRules;
    }

    public Campaign withTargetingRules(TargetingRules targetingRules) {
        this.targetingRules = targetingRules;
        return this;
    }

    /**
     * 
     */
    public TimeFilter getTimeFilter() {
        return timeFilter;
    }

    /**
     * 
     */
    public void setTimeFilter(TimeFilter timeFilter) {
        this.timeFilter = timeFilter;
    }

    public Campaign withTimeFilter(TimeFilter timeFilter) {
        this.timeFilter = timeFilter;
        return this;
    }

    /**
     * 
     */
    public TimeTrigger getTimeTrigger() {
        return timeTrigger;
    }

    /**
     * 
     */
    public void setTimeTrigger(TimeTrigger timeTrigger) {
        this.timeTrigger = timeTrigger;
    }

    public Campaign withTimeTrigger(TimeTrigger timeTrigger) {
        this.timeTrigger = timeTrigger;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Campaign withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
