# Auth Facade Service

This project is a lightweight Spring Boot web service that acts as an **authorization facade**, exposing a `/authorize` endpoint. It receives requests, forwards them to a mocked downstream service, and returns the authorization decision.

---

## ✅ Features

- Exposes a REST API at `POST /authorize`
- Forwards request to a mocked downstream authorization check
- Responds with `{"authorized": true/false}`
- Actuator endpoints enabled for observability
- Designed to support concurrent requests and timeouts
- The application is designed stateless, allowing safe processing of concurrent requests. In production, it can scale horizontally with a load balancer.


---

## 🛠️ How to Run the Service

1. **Requirements**:
    - Java 8+ 
    - Maven

2. **Steps to Run**:
   ```bash
   mvn clean install
   mvn spring-boot:run

# TODO
- Add unit and integration tests
- Reactive programming
- Add CircuitBreaker

# What does "production-ready" mean to you?
- To me, a production-ready application is one that is stable, secure, and observable enough to be safely deployed to real users. It handles edge cases gracefully (like timeouts or bad input), supports high concurrency under load, and offers proper logging and metrics for monitoring and debugging and easy to extend.

# What I Would Do Next
- Integrate Resilience4j
- Add JWT or OAuth2
- Add Swagger
- Add Unit and Integration Tests
- Dockerize the Application

# Time Spent
- 2-3 Hours.