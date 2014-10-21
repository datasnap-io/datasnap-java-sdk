
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Device {

    /**
     * 
     */
    private String carrierName;
    /**
     * 
     */
    private String countryCode;
    /**
     * 
     */
    private String ipAddress;
    /**
     * 
     */
    private String manufacturer;
    /**
     * 
     */
    private String model;
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private String networkCode;
    /**
     * 
     */
    private String osVersion;
    /**
     * 
     */
    private String platform;
    /**
     * 
     */
    private String userAgent;
    /**
     * 
     */
    private String venderId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * 
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public Device withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Device withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Device withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Device withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     */
    public void setModel(String model) {
        this.model = model;
    }

    public Device withModel(String model) {
        this.model = model;
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

    public Device withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * 
     */
    public void setNetworkCode(String networkCode) {
        this.networkCode = networkCode;
    }

    public Device withNetworkCode(String networkCode) {
        this.networkCode = networkCode;
        return this;
    }

    /**
     * 
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * 
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Device withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Device withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Device withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * 
     */
    public String getVenderId() {
        return venderId;
    }

    /**
     * 
     */
    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public Device withVenderId(String venderId) {
        this.venderId = venderId;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Device withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
