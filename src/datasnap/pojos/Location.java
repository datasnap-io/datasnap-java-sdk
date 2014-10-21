
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Location {

    /**
     * 
     */
    private List<Float> coordinates = new ArrayList<Float>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public List<Float> getCoordinates() {
        return coordinates;
    }

    /**
     * 
     */
    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }

    public Location withCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
