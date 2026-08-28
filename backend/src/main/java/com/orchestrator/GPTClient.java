package com.orchestrator.agents;

import org.springframework.stereotype.Component;

@Component
public class GPTClient {
    public String query(String prompt) {
        // Placeholder: call GPT API using credentials from .env
        return "GPT response for: " + prompt;
    }
}
