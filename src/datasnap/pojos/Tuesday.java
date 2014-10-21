
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Tuesday {

    /**
     * 
     */
    private String end;
    /**
     * 
     */
    private String start;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getEnd() {
        return end;
    }

    /**
     * 
     */
    public void setEnd(String end) {
        this.end = end;
    }

    public Tuesday withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * 
     */
    public String getStart() {
        return start;
    }

    /**
     * 
     */
    public void setStart(String start) {
        this.start = start;
    }

    public Tuesday withStart(String start) {
        this.start = start;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Tuesday withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
