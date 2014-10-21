
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class User {

    /**
     * 
     */
    private Audience audience;
    /**
     * 
     */
    private Boolean optInLocation;
    /**
     * 
     */
    private Boolean optInPushNotifications;
    /**
     * 
     */
    private Boolean optInVendor;
    /**
     * 
     */
    private List<String> tags = new ArrayList<String>();
    /**
     * 
     */
    private UserProperties userProperties;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public Audience getAudience() {
        return audience;
    }

    /**
     * 
     */
    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public User withAudience(Audience audience) {
        this.audience = audience;
        return this;
    }

    /**
     * 
     */
    public Boolean getOptInLocation() {
        return optInLocation;
    }

    /**
     * 
     */
    public void setOptInLocation(Boolean optInLocation) {
        this.optInLocation = optInLocation;
    }

    public User withOptInLocation(Boolean optInLocation) {
        this.optInLocation = optInLocation;
        return this;
    }

    /**
     * 
     */
    public Boolean getOptInPushNotifications() {
        return optInPushNotifications;
    }

    /**
     * 
     */
    public void setOptInPushNotifications(Boolean optInPushNotifications) {
        this.optInPushNotifications = optInPushNotifications;
    }

    public User withOptInPushNotifications(Boolean optInPushNotifications) {
        this.optInPushNotifications = optInPushNotifications;
        return this;
    }

    /**
     * 
     */
    public Boolean getOptInVendor() {
        return optInVendor;
    }

    /**
     * 
     */
    public void setOptInVendor(Boolean optInVendor) {
        this.optInVendor = optInVendor;
    }

    public User withOptInVendor(Boolean optInVendor) {
        this.optInVendor = optInVendor;
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

    public User withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     */
    public UserProperties getUserProperties() {
        return userProperties;
    }

    /**
     * 
     */
    public void setUserProperties(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public User withUserProperties(UserProperties userProperties) {
        this.userProperties = userProperties;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public User withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
