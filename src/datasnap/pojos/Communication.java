
package datasnap.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Communication {

    /**
     * 
     */
    private String communicationVendorId;
    /**
     * 
     */
    private Content content;
    /**
     * 
     */
    private String description;
    /**
     * 
     */
    private String id;
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private String status;
    /**
     * 
     */
    private List<String> tags = new ArrayList<String>();
    /**
     * 
     */
    private Type type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public String getCommunicationVendorId() {
        return communicationVendorId;
    }

    /**
     * 
     */
    public void setCommunicationVendorId(String communicationVendorId) {
        this.communicationVendorId = communicationVendorId;
    }

    public Communication withCommunicationVendorId(String communicationVendorId) {
        this.communicationVendorId = communicationVendorId;
        return this;
    }

    /**
     * 
     */
    public Content getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(Content content) {
        this.content = content;
    }

    public Communication withContent(Content content) {
        this.content = content;
        return this;
    }

    /**
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Communication withDescription(String description) {
        this.description = description;
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

    public Communication withId(String id) {
        this.id = id;
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

    public Communication withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Communication withStatus(String status) {
        this.status = status;
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

    public Communication withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     */
    public Type getType() {
        return type;
    }

    /**
     * 
     */
    public void setType(Type type) {
        this.type = type;
    }

    public Communication withType(Type type) {
        this.type = type;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Communication withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
