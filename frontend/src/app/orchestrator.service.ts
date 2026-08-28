import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class OrchestratorService {
  private baseUrl = '/api/orchestrator';

  constructor(private http: HttpClient) {}

  runAgent(agentName: string, prompt: string) {
    return this.http.post(`${this.baseUrl}/run?agentName=${agentName}`, { prompt });
  }

  listAgents() {
    return this.http.get<string[]>(`${this.baseUrl}/agents`);
  }
}
