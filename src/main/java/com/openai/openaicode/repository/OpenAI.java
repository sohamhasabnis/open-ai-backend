package com.openai.openaicode.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.openai.openaicode.model.Schema;
import com.openai.openaicode.model.SchemaResponse;

public interface OpenAI {
    SchemaResponse getResponse(Schema schema) throws JsonProcessingException;
}
