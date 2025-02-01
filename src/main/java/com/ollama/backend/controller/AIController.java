package com.ollama.backend.controller;

import com.ollama.backend.service.ServiceAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ai")
public class AIController {

    @Autowired
    private ServiceAI serviceAI;

    @GetMapping("/")
    public ResponseEntity<String> askAi(
            @RequestParam(value = "query", required = false, defaultValue = "How are you.?") String query) {
        String response = serviceAI.askAI(query);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
