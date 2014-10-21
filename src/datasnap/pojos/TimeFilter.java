
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TimeFilter {

    /**
     * 
     */
    private Monday monday;
    /**
     * 
     */
    private Tuesday tuesday;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public Monday getMonday() {
        return monday;
    }

    /**
     * 
     */
    public void setMonday(Monday monday) {
        this.monday = monday;
    }

    public TimeFilter withMonday(Monday monday) {
        this.monday = monday;
        return this;
    }

    /**
     * 
     */
    public Tuesday getTuesday() {
        return tuesday;
    }

    /**
     * 
     */
    public void setTuesday(Tuesday tuesday) {
        this.tuesday = tuesday;
    }

    public TimeFilter withTuesday(Tuesday tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TimeFilter withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
