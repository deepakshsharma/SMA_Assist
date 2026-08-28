package com.orchestrator.agents;

import org.springframework.stereotype.Component;

@Component
public class SqlAgent implements AgentInterface {
    @Override
    public String getName() {
        return "SQL";
    }

    @Override
    public AgentResponse execute(AgentRequest request) {
        // Placeholder: connect to DB and run query
        return new AgentResponse("SQL query executed: " + request.getPrompt());
    }
}
