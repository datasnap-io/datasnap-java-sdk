
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TargetingRules {

    /**
     * 
     */
    private String id;
    /**
     * 
     */
    private List<Object> rules = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public TargetingRules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     */
    public List<Object> getRules() {
        return rules;
    }

    /**
     * 
     */
    public void setRules(List<Object> rules) {
        this.rules = rules;
    }

    public TargetingRules withRules(List<Object> rules) {
        this.rules = rules;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TargetingRules withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
