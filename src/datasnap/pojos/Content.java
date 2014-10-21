
package datasnap.pojos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Content {

    /**
     * 
     */
    private String description;
    /**
     * 
     */
    private String html;
    /**
     * 
     */
    private String image;
    /**
     * 
     */
    private String text;
    /**
     * 
     */
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Content withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     */
    public String getHtml() {
        return html;
    }

    /**
     * 
     */
    public void setHtml(String html) {
        this.html = html;
    }

    public Content withHtml(String html) {
        this.html = html;
        return this;
    }

    /**
     * 
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     */
    public void setImage(String image) {
        this.image = image;
    }

    public Content withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * 
     */
    public void setText(String text) {
        this.text = text;
    }

    public Content withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Content withUrl(String url) {
        this.url = url;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Content withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
