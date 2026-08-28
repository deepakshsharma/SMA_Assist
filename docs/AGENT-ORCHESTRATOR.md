# Agent Orchestrator System – Full Specification

## 📌 Overview
This system implements an **Agent Orchestrator** in **Spring Boot (Java)** with an **Angular frontend**, deployed on **Azure Kubernetes Service (AKS)** using **Docker** and **Terraform**.  
The orchestrator manages multiple agents:

- **RAG Agent** → Retrieval-Augmented Generation for "Talk to Documents"
- **SQL Agent** → SQL-based data retrieval for "Talk to Tables"
- **AMAI Agent** → In-house LLM agent connected to GPT in the background
- **Custom Agents** → Extendable for other business logic

---

## 🏗️ Architecture

