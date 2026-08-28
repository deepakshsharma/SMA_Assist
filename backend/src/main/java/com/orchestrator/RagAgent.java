package com.orchestrator.agents;

import org.springframework.stereotype.Component;

@Component
public class RagAgent implements AgentInterface {
    @Override
    public String getName() {
        return "RAG";
    }

    @Override
    public AgentResponse execute(AgentRequest request) {
        // Placeholder: integrate vector DB + retriever logic
        return new AgentResponse("RAG search result for: " + request.getPrompt());
    }
}
