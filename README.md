# AI QA Agent

AI-powered assistant for QA automation engineers.

## Overview

AI QA Agent is a Spring Boot application that uses Large Language Models
to support software testing activities.

The goal of this project is to build an AI agent that helps QA engineers with:
- generating test scenarios,
- analyzing API specifications,
- creating automated test templates,
- analyzing failed test executions.

## Tech Stack

- Java 21
- Spring Boot 4.1.0
- Maven
- JUnit 5
- REST Assured
- Google Gemini API

## Architecture

The application is designed with an AI provider abstraction layer,
allowing integration with different AI models.

Planned providers:
- Google Gemini
- OpenAI

## Roadmap

- [x] Spring Boot project setup
- [x] Initial project structure
- [ ] Gemini API integration
- [ ] First AI interaction
- [ ] OpenAPI specification analyzer
- [ ] Test case generator
- [ ] RestAssured test generation
- [ ] Test failure analysis

## Project Status

🚧 Work in progress