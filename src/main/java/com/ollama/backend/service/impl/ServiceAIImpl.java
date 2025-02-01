package com.ollama.backend.service.impl;

import com.ollama.backend.service.ServiceAI;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ServiceAIImpl implements ServiceAI {

    private ChatClient client;

    public ServiceAIImpl(ChatClient.Builder builder) {
        this.client = builder.build();

    }

    @Override
    public String askAI(String question) {
        return client.prompt(question).call().content();
    }


}
