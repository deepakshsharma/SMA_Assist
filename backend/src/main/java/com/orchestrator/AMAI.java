package com.orchestrator.agents;

import org.springframework.stereotype.Component;

@Component
public class AMAI implements AgentInterface {
    private final GPTClient gptClient;

    public AMAI(GPTClient gptClient) {
        this.gptClient = gptClient;
    }

    @Override
    public String getName() {
        return "AMAI";
    }

    @Override
    public AgentResponse execute(AgentRequest request) {
        String gptResponse = gptClient.query(request.getPrompt());
        return new AgentResponse(gptResponse);
    }
}
