
package datasnap.pojos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Audience {

    /**
     * 
     */
    private List<String> age = new ArrayList<String>();
    /**
     * 
     */
    private List<String> education = new ArrayList<String>();
    /**
     * 
     */
    private List<String> ethnicity = new ArrayList<String>();
    /**
     * 
     */
    private List<String> gender = new ArrayList<String>();
    /**
     * 
     */
    private List<String> income = new ArrayList<String>();
    /**
     * 
     */
    private List<String> interests = new ArrayList<String>();
    /**
     * 
     */
    private List<String> kids = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    public List<String> getAge() {
        return age;
    }

    /**
     * 
     */
    public void setAge(List<String> age) {
        this.age = age;
    }

    public Audience withAge(List<String> age) {
        this.age = age;
        return this;
    }

    /**
     * 
     */
    public List<String> getEducation() {
        return education;
    }

    /**
     * 
     */
    public void setEducation(List<String> education) {
        this.education = education;
    }

    public Audience withEducation(List<String> education) {
        this.education = education;
        return this;
    }

    /**
     * 
     */
    public List<String> getEthnicity() {
        return ethnicity;
    }

    /**
     * 
     */
    public void setEthnicity(List<String> ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Audience withEthnicity(List<String> ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * 
     */
    public List<String> getGender() {
        return gender;
    }

    /**
     * 
     */
    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public Audience withGender(List<String> gender) {
        this.gender = gender;
        return this;
    }

    /**
     * 
     */
    public List<String> getIncome() {
        return income;
    }

    /**
     * 
     */
    public void setIncome(List<String> income) {
        this.income = income;
    }

    public Audience withIncome(List<String> income) {
        this.income = income;
        return this;
    }

    /**
     * 
     */
    public List<String> getInterests() {
        return interests;
    }

    /**
     * 
     */
    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Audience withInterests(List<String> interests) {
        this.interests = interests;
        return this;
    }

    /**
     * 
     */
    public List<String> getKids() {
        return kids;
    }

    /**
     * 
     */
    public void setKids(List<String> kids) {
        this.kids = kids;
    }

    public Audience withKids(List<String> kids) {
        this.kids = kids;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Audience withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
