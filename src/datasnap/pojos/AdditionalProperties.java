
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AdditionalProperties {

    /**
     * 
     */
    /**
     * 
     */
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
        

   


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AdditionalProperties withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
