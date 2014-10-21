
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TimeTrigger {

    /**
     * 
     */
    private String monday;
    /**
     * 
     */
    private String tuesday;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getMonday() {
        return monday;
    }

    /**
     * 
     */
    public void setMonday(String monday) {
        this.monday = monday;
    }

    public TimeTrigger withMonday(String monday) {
        this.monday = monday;
        return this;
    }

    /**
     * 
     */
    public String getTuesday() {
        return tuesday;
    }

    /**
     * 
     */
    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public TimeTrigger withTuesday(String tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TimeTrigger withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
