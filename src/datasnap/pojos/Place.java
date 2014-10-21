
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Place {

    /**
     * 
     */
    private Address address;
    /**
     * 
     */
    private List<Beacon_> beacons = new ArrayList<Beacon_>();
    /**
     * 
     */
    private List<Geofence> geofences = new ArrayList<Geofence>();
    /**
     * 
     */
    private String id;
    /**
     * 
     */
    private String lastPlace;
    /**
     * 
     */
    private List<String> tags = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public Place withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     */
    public List<Beacon_> getBeacons() {
        return beacons;
    }

    /**
     * 
     */
    public void setBeacons(List<Beacon_> beacons) {
        this.beacons = beacons;
    }

    public Place withBeacons(List<Beacon_> beacons) {
        this.beacons = beacons;
        return this;
    }

    /**
     * 
     */
    public List<Geofence> getGeofences() {
        return geofences;
    }

    /**
     * 
     */
    public void setGeofences(List<Geofence> geofences) {
        this.geofences = geofences;
    }

    public Place withGeofences(List<Geofence> geofences) {
        this.geofences = geofences;
        return this;
    }

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

    public Place withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     */
    public String getLastPlace() {
        return lastPlace;
    }

    /**
     * 
     */
    public void setLastPlace(String lastPlace) {
        this.lastPlace = lastPlace;
    }

    public Place withLastPlace(String lastPlace) {
        this.lastPlace = lastPlace;
        return this;
    }

    /**
     * 
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Place withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Place withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
