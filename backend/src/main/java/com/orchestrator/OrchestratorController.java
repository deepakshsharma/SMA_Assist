package com.orchestrator.controller;

import com.orchestrator.agents.AgentRequest;
import com.orchestrator.agents.AgentResponse;
import com.orchestrator.service.AgentOrchestratorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orchestrator")
public class OrchestratorController {
    private final AgentOrchestratorService orchestratorService;

    public OrchestratorController(AgentOrchestratorService orchestratorService) {
        this.orchestratorService = orchestratorService;
    }

    @PostMapping("/run")
    public AgentResponse runAgent(@RequestBody AgentRequest request,
                                  @RequestParam String agentName) {
        return orchestratorService.runAgent(agentName, request);
    }

    @GetMapping("/agents")
    public List<String> listAgents() {
        return orchestratorService.listAgents();
    }
}
