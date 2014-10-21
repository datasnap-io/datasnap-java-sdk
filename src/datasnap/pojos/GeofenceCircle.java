
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class GeofenceCircle {

    /**
     * 
     */
    private Location location;
    /**
     * 
     */
    private Float radius;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public GeofenceCircle withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * 
     */
    public Float getRadius() {
        return radius;
    }

    /**
     * 
     */
    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public GeofenceCircle withRadius(Float radius) {
        this.radius = radius;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public GeofenceCircle withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
