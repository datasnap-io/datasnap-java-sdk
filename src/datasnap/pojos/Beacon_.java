
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Beacon_ {

    /**
     * 
     */
    private String beaconid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getBeaconid() {
        return beaconid;
    }

    /**
     * 
     */
    public void setBeaconid(String beaconid) {
        this.beaconid = beaconid;
    }

    public Beacon_ withBeaconid(String beaconid) {
        this.beaconid = beaconid;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Beacon_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
