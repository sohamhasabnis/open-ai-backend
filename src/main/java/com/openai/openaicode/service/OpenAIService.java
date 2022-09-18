package com.openai.openaicode.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface OpenAIService {
    String openAIResponse(String textToSearch, String command) throws JsonProcessingException;
    String blogArticle(String textToSearch, String command, Integer characters) throws JsonProcessingException;
}
