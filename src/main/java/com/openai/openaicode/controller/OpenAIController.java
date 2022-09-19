package com.openai.openaicode.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.openai.openaicode.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@CrossOrigin(origins = "*", allowedHeaders = "*",methods = {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/get-blog")
public class OpenAIController {

    private final OpenAIService openAIService;

    @Autowired
    public OpenAIController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @GetMapping("/ideas")
    public ResponseEntity<String> getProductResponse(@RequestParam("text") String text, @RequestParam("command") String command) throws JsonProcessingException {
        System.out.println("text = " + text + ", command = " + command);
        String resp = openAIService.openAIResponse(text, command);
        return getStringResponseEntity(resp);
    }

    private ResponseEntity<String> getStringResponseEntity(String resp) {
        if (Objects.nonNull(resp) && !resp.isBlank()) {
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }
        return new ResponseEntity<>("Error while fetching service", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/article")
    public ResponseEntity<String> getBlogArticle(@RequestParam("text") String text, @RequestParam("command") String command, @RequestParam("characterLimit") Integer character) throws JsonProcessingException {
        return getStringResponseEntity(openAIService.blogArticle(text, command, character));
    }

}
