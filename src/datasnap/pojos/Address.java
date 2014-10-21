
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Address {

    /**
     * 
     */
    private String address1;
    /**
     * 
     */
    private String address2;
    /**
     * 
     */
    private String city;
    /**
     * 
     */
    private String region;
    /**
     * 
     */
    private Float zip4;
    /**
     * 
     */
    private Float zip;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public Address withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * 
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Address withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     */
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public Address withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 
     */
    public Float getZip4() {
        return zip4;
    }

    /**
     * 
     */
    public void setZip4(Float zip4) {
        this.zip4 = zip4;
    }

    public Address withZip4(Float zip4) {
        this.zip4 = zip4;
        return this;
    }

    /**
     * 
     */
    public Float getZip() {
        return zip;
    }

    /**
     * 
     */
    public void setZip(Float zip) {
        this.zip = zip;
    }

    public Address withZip(Float zip) {
        this.zip = zip;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
