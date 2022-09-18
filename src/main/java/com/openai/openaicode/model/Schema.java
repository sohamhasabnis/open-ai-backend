package com.openai.openaicode.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

public class Schema {

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
    @JsonProperty("prompt")
    private String prompt;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("temperature")
    private Integer temperature;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("top_p")
    private Integer topP;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("n")
    private Integer n;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stream")
    private Boolean stream;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("logprobs")
    private Object logprobs;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stop")
    private String stop;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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
    @JsonProperty("prompt")
    public String getPrompt() {
        return prompt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("prompt")
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("max_tokens")
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("max_tokens")
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("temperature")
    public Integer getTemperature() {
        return temperature;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("temperature")
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("top_p")
    public Integer getTopP() {
        return topP;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("top_p")
    public void setTopP(Integer topP) {
        this.topP = topP;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("n")
    public Integer getN() {
        return n;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("n")
    public void setN(Integer n) {
        this.n = n;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stream")
    public Boolean getStream() {
        return stream;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stream")
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("logprobs")
    public Object getLogprobs() {
        return logprobs;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("logprobs")
    public void setLogprobs(Object logprobs) {
        this.logprobs = logprobs;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stop")
    public String getStop() {
        return stop;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stop")
    public void setStop(String stop) {
        this.stop = stop;
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
        sb.append(Schema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("prompt");
        sb.append('=');
        sb.append(((this.prompt == null)?"<null>":this.prompt));
        sb.append(',');
        sb.append("maxTokens");
        sb.append('=');
        sb.append(((this.maxTokens == null)?"<null>":this.maxTokens));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("topP");
        sb.append('=');
        sb.append(((this.topP == null)?"<null>":this.topP));
        sb.append(',');
        sb.append("n");
        sb.append('=');
        sb.append(((this.n == null)?"<null>":this.n));
        sb.append(',');
        sb.append("stream");
        sb.append('=');
        sb.append(((this.stream == null)?"<null>":this.stream));
        sb.append(',');
        sb.append("logprobs");
        sb.append('=');
        sb.append(((this.logprobs == null)?"<null>":this.logprobs));
        sb.append(',');
        sb.append("stop");
        sb.append('=');
        sb.append(((this.stop == null)?"<null>":this.stop));
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
        result = ((result* 31)+((this.stop == null)? 0 :this.stop.hashCode()));
        result = ((result* 31)+((this.stream == null)? 0 :this.stream.hashCode()));
        result = ((result* 31)+((this.maxTokens == null)? 0 :this.maxTokens.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.prompt == null)? 0 :this.prompt.hashCode()));
        result = ((result* 31)+((this.topP == null)? 0 :this.topP.hashCode()));
        result = ((result* 31)+((this.n == null)? 0 :this.n.hashCode()));
        result = ((result* 31)+((this.logprobs == null)? 0 :this.logprobs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schema) == false) {
            return false;
        }
        Schema rhs = ((Schema) other);
        return (((((((((((this.stop == rhs.stop)||((this.stop!= null)&&this.stop.equals(rhs.stop)))&&((this.stream == rhs.stream)||((this.stream!= null)&&this.stream.equals(rhs.stream))))&&((this.maxTokens == rhs.maxTokens)||((this.maxTokens!= null)&&this.maxTokens.equals(rhs.maxTokens))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.prompt == rhs.prompt)||((this.prompt!= null)&&this.prompt.equals(rhs.prompt))))&&((this.topP == rhs.topP)||((this.topP!= null)&&this.topP.equals(rhs.topP))))&&((this.n == rhs.n)||((this.n!= null)&&this.n.equals(rhs.n))))&&((this.logprobs == rhs.logprobs)||((this.logprobs!= null)&&this.logprobs.equals(rhs.logprobs))));
    }

}

