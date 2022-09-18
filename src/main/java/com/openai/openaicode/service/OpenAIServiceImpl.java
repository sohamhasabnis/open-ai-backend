package com.openai.openaicode.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openai.openaicode.model.Schema;
import com.openai.openaicode.model.SchemaResponse;
import com.openai.openaicode.repository.OpenAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class OpenAIServiceImpl implements OpenAIService{

    private final OpenAI openAI;

    @Autowired
    public OpenAIServiceImpl(OpenAI openAI) {
        this.openAI = openAI;
    }

    @Override
    public String openAIResponse(String textToSearch, String command) throws JsonProcessingException {
        Schema schema = new Schema();
        schema.setModel("text-davinci-002");
        schema.setPrompt(command+" "+textToSearch);
        schema.setMaxTokens(1024);
        schema.setTemperature(0);
        schema.setTopP(1);
        schema.setN(1);
        schema.setStream(false);
        schema.setLogprobs(null);
        schema.setStop("");
        SchemaResponse schemaResponse = openAI.getResponse(schema);
        return getResponseValue(schemaResponse);
    }

    private String getResponseValue(SchemaResponse schemaResponse) throws JsonProcessingException {
        String out ="";
        if(Objects.nonNull(schemaResponse) && Objects.nonNull(schemaResponse.getChoices()) && !schemaResponse.getChoices().isEmpty()) {
            ObjectMapper objectMapper = new ObjectMapper();

            out = objectMapper.writeValueAsString(schemaResponse.getChoices().get(0));

            System.out.println("out = " + out);
        } else {
            System.out.println("Else");
        }
        return out;
    }

    @Override
    public String blogArticle(String textToSearch, String command, Integer characters) throws JsonProcessingException {
        Schema schema = new Schema();
        schema.setModel("text-davinci-002");
        schema.setPrompt(command+" "+textToSearch);
        schema.setMaxTokens(characters);
        schema.setTemperature(0);
        schema.setTopP(1);
        schema.setN(1);
        schema.setStream(false);
        schema.setLogprobs(null);
        schema.setStop("");
        SchemaResponse schemaResponse = openAI.getResponse(schema);
        return getResponseValue(schemaResponse);
    }
}
