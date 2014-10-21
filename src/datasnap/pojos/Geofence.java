
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Geofence {

    /**
     * 
     */
    private String geofenceid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getGeofenceid() {
        return geofenceid;
    }

    /**
     * 
     */
    public void setGeofenceid(String geofenceid) {
        this.geofenceid = geofenceid;
    }

    public Geofence withGeofenceid(String geofenceid) {
        this.geofenceid = geofenceid;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Geofence withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
