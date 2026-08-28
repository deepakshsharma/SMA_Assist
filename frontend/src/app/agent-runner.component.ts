import { Component } from '@angular/core';
import { OrchestratorService } from '../services/orchestrator.service';

@Component({
  selector: 'app-agent-runner',
  template: `
    <div>
      <h2>Agent Runner</h2>
      <input [(ngModel)]="prompt" placeholder="Enter prompt"/>
      <select [(ngModel)]="agentName">
        <option *ngFor="let agent of agents" [value]="agent">{{agent}}</option>
      </select>
      <button (click)="run()">Run Agent</button>
      <p *ngIf="result">{{result}}</p>
    </div>
  `
})
export class AgentRunnerComponent {
  agents: string[] = [];
  agentName = '';
  prompt = '';
  result = '';

  constructor(private orchestrator: OrchestratorService) {
    this.orchestrator.listAgents().subscribe(a => this.agents = a);
  }

  run() {
    this.orchestrator.runAgent(this.agentName, this.prompt)
      .subscribe((res: any) => this.result = res.result);
  }
}
