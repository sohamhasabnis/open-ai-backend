package com.openai.openaicode.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SchemaResponse {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("object")
    private String object;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("created")
    private Integer created;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("model")
    private String model;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("choices")
    private List<Object> choices = new ArrayList<Object>();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("usage")
    private Usage usage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("created")
    public Integer getCreated() {
        return created;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("created")
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("choices")
    public List<Object> getChoices() {
        return choices;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("choices")
    public void setChoices(List<Object> choices) {
        this.choices = choices;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("usage")
    public Usage getUsage() {
        return usage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchemaResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("choices");
        sb.append('=');
        sb.append(((this.choices == null)?"<null>":this.choices));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.choices == null)? 0 :this.choices.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaResponse) == false) {
            return false;
        }
        SchemaResponse rhs = ((SchemaResponse) other);
        return ((((((((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created)))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.choices == rhs.choices)||((this.choices!= null)&&this.choices.equals(rhs.choices))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

}
