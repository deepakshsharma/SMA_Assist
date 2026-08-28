package com.orchestrator.agents;

public interface AgentInterface {
    String getName();
    AgentResponse execute(AgentRequest request);
}
