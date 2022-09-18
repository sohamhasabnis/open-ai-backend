package com.openai.openaicode.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Usage {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("prompt_tokens")
    private Integer promptTokens;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("completion_tokens")
    private Integer completionTokens;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("total_tokens")
    private Integer totalTokens;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("prompt_tokens")
    public Integer getPromptTokens() {
        return promptTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("prompt_tokens")
    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("completion_tokens")
    public Integer getCompletionTokens() {
        return completionTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("completion_tokens")
    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("total_tokens")
    public Integer getTotalTokens() {
        return totalTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("total_tokens")
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
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
        sb.append(Usage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("promptTokens");
        sb.append('=');
        sb.append(((this.promptTokens == null)?"<null>":this.promptTokens));
        sb.append(',');
        sb.append("completionTokens");
        sb.append('=');
        sb.append(((this.completionTokens == null)?"<null>":this.completionTokens));
        sb.append(',');
        sb.append("totalTokens");
        sb.append('=');
        sb.append(((this.totalTokens == null)?"<null>":this.totalTokens));
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
        result = ((result* 31)+((this.promptTokens == null)? 0 :this.promptTokens.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalTokens == null)? 0 :this.totalTokens.hashCode()));
        result = ((result* 31)+((this.completionTokens == null)? 0 :this.completionTokens.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Usage) == false) {
            return false;
        }
        Usage rhs = ((Usage) other);
        return (((((this.promptTokens == rhs.promptTokens)||((this.promptTokens!= null)&&this.promptTokens.equals(rhs.promptTokens)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalTokens == rhs.totalTokens)||((this.totalTokens!= null)&&this.totalTokens.equals(rhs.totalTokens))))&&((this.completionTokens == rhs.completionTokens)||((this.completionTokens!= null)&&this.completionTokens.equals(rhs.completionTokens))));
    }

}
