package com.openai.openaicode.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openai.openaicode.model.Schema;
import com.openai.openaicode.model.SchemaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Repository
public class OpenAIRepoImpl implements OpenAI{

    private final  RestTemplate restTemplate;

    @Autowired
    public OpenAIRepoImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public SchemaResponse getResponse(Schema schema) {
        String url = "https://api.openai.com/v1/completions";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth("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");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        ObjectMapper objectMapper = new ObjectMapper();
        String a = null;
        try {
            a = objectMapper.writeValueAsString(schema);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("a = " + a);
        HttpEntity<?> httpEntity = new HttpEntity<Object>(schema,httpHeaders);
        SchemaResponse response = restTemplate.exchange(url, HttpMethod.POST,httpEntity,SchemaResponse.class).getBody();
        System.out.println("object = " + response.toString());
        return response;
    }
}
