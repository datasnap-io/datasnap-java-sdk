
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class GeofencePolygon {

    /**
     * 
     */
    private List<Location> locations = new ArrayList<Location>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * 
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public GeofencePolygon withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public GeofencePolygon withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
