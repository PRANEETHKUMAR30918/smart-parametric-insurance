# Backend - SentinelFlow

The backend layer of SentinelFlow handles the core business logic, including risk detection, fraud validation, and payout processing.

## Responsibilities

* Process real-time environmental and user data
* Detect risk conditions for parametric payouts
* Identify fraudulent behavior using multiple signals
* Execute payout decisions

## Core Modules

* **RiskController.java** – Handles risk detection requests
* **FraudDetector.java** – Evaluates fraud signals and anomalies
* **PayoutService.java** – Processes payout logic

## Architecture Overview

The backend follows an event-driven approach where data flows through:

Data Ingestion → Risk Engine → Fraud Detection → Decision Engine → Payout System

## Tech Stack

* Spring Boot (Java)
* Apache Kafka (event streaming)
* PostgreSQL
* Neo4j (graph-based fraud detection)

## Future Enhancements

* Advanced ML-based fraud detection
* Integration with external insurance APIs
* Scalable microservices deployment
