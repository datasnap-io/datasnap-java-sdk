
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Beacon {

    /**
     * 
     */
    private String batteryLevel;
    /**
     * 
     */
    private String bleUuid;
    /**
     * 
     */
    private String bleVendorId;
    /**
     * 
     */
    private String bleVendorUuid;
    /**
     * 
     */
    private List<Object> categories = new ArrayList<Object>();
    /**
     * 
     */
    private Float dwellTime;
    /**
     * 
     */
    private String hardware;
    /**
     * 
     */
    private String identifier;
    /**
     * 
     */
    private String lastUpdateTime;
    /**
     * 
     */
    private Float latitude;
    /**
     * 
     */
    private Float longitude;
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private Float previousRssi;
    /**
     * 
     */
    private Float rssi;
    /**
     * 
     */
    private String startTime;
    /**
     * 
     */
    private List<String> tags = new ArrayList<String>();
    /**
     * 
     */
    private String temperature;
    /**
     * 
     */
    private String visibility;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * 
     */
    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Beacon withBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
        return this;
    }

    /**
     * 
     */
    public String getBleUuid() {
        return bleUuid;
    }

    /**
     * 
     */
    public void setBleUuid(String bleUuid) {
        this.bleUuid = bleUuid;
    }

    public Beacon withBleUuid(String bleUuid) {
        this.bleUuid = bleUuid;
        return this;
    }

    /**
     * 
     */
    public String getBleVendorId() {
        return bleVendorId;
    }

    /**
     * 
     */
    public void setBleVendorId(String bleVendorId) {
        this.bleVendorId = bleVendorId;
    }

    public Beacon withBleVendorId(String bleVendorId) {
        this.bleVendorId = bleVendorId;
        return this;
    }

    /**
     * 
     */
    public String getBleVendorUuid() {
        return bleVendorUuid;
    }

    /**
     * 
     */
    public void setBleVendorUuid(String bleVendorUuid) {
        this.bleVendorUuid = bleVendorUuid;
    }

    public Beacon withBleVendorUuid(String bleVendorUuid) {
        this.bleVendorUuid = bleVendorUuid;
        return this;
    }

    /**
     * 
     */
    public List<Object> getCategories() {
        return categories;
    }

    /**
     * 
     */
    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public Beacon withCategories(List<Object> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * 
     */
    public Float getDwellTime() {
        return dwellTime;
    }

    /**
     * 
     */
    public void setDwellTime(Float dwellTime) {
        this.dwellTime = dwellTime;
    }

    public Beacon withDwellTime(Float dwellTime) {
        this.dwellTime = dwellTime;
        return this;
    }

    /**
     * 
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * 
     */
    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public Beacon withHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }

    /**
     * 
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Beacon withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Beacon withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Beacon withLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Beacon withLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Beacon withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     */
    public Float getPreviousRssi() {
        return previousRssi;
    }

    /**
     * 
     */
    public void setPreviousRssi(Float previousRssi) {
        this.previousRssi = previousRssi;
    }

    public Beacon withPreviousRssi(Float previousRssi) {
        this.previousRssi = previousRssi;
        return this;
    }

    /**
     * 
     */
    public Float getRssi() {
        return rssi;
    }

    /**
     * 
     */
    public void setRssi(Float rssi) {
        this.rssi = rssi;
    }

    public Beacon withRssi(Float rssi) {
        this.rssi = rssi;
        return this;
    }

    /**
     * 
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Beacon withStartTime(String startTime) {
        this.startTime = startTime;
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

    public Beacon withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * 
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Beacon withTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * 
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Beacon withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Beacon withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
