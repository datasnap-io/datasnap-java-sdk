
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class UserProperties {

    /**
     * 
     */
    private String engagementTime;
    /**
     * 
     */
    private String userSpend;
    /**
     * 
     */
    private String userType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getEngagementTime() {
        return engagementTime;
    }

    /**
     * 
     */
    public void setEngagementTime(String engagementTime) {
        this.engagementTime = engagementTime;
    }

    public UserProperties withEngagementTime(String engagementTime) {
        this.engagementTime = engagementTime;
        return this;
    }

    /**
     * 
     */
    public String getUserSpend() {
        return userSpend;
    }

    /**
     * 
     */
    public void setUserSpend(String userSpend) {
        this.userSpend = userSpend;
    }

    public UserProperties withUserSpend(String userSpend) {
        this.userSpend = userSpend;
        return this;
    }

    /**
     * 
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public UserProperties withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UserProperties withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
