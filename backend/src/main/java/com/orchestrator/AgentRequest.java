package com.orchestrator.agents;

public class AgentRequest {
    private String prompt;

    public AgentRequest(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }
}
