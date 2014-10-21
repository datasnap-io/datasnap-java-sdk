
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Datasnap {

    /**
     * 
     */
    private String created;
    /**
     * 
     */
    private Device device;
    /**
     * 
     */
    private Location location;
    /**
     * 
     */
    private String timestamp;
    /**
     * 
     */
    private String timezone;
    /**
     * 
     */
    private String txnId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     */
    public void setCreated(String created) {
        this.created = created;
    }

    public Datasnap withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 
     */
    public Device getDevice() {
        return device;
    }

    /**
     * 
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    public Datasnap withDevice(Device device) {
        this.device = device;
        return this;
    }

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

    public Datasnap withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * 
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Datasnap withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Datasnap withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 
     */
    public String getTxnId() {
        return txnId;
    }

    /**
     * 
     */
    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public Datasnap withTxnId(String txnId) {
        this.txnId = txnId;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Datasnap withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
