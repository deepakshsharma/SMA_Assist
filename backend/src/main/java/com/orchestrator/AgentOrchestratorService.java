package com.orchestrator.service;

import com.orchestrator.agents.AgentInterface;
import com.orchestrator.agents.AgentRequest;
import com.orchestrator.agents.AgentResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AgentOrchestratorService {
    private final Map<String, AgentInterface> agents;

    public AgentOrchestratorService(List<AgentInterface> agentList) {
        agents = agentList.stream()
                          .collect(Collectors.toMap(AgentInterface::getName, a -> a));
    }

    public AgentResponse runAgent(String agentName, AgentRequest request) {
        if (!agents.containsKey(agentName)) {
            return new AgentResponse("Agent not found: " + agentName);
        }
        return agents.get(agentName).execute(request);
    }

    public List<String> listAgents() {
        return agents.keySet().stream().toList();
    }
}
