# Java Microservices Guide

## Patterns

### API Gateway
```yaml
# Spring Cloud Gateway
spring:
  cloud:
    gateway:
      routes:
        - id: user-service
          uri: lb://USER-SERVICE
          predicates:
            - Path=/api/users/**
```

### Service Discovery
```yaml
# Eureka Client
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka
  instance:
    prefer-ip-address: true
```

### Circuit Breaker
```java
@CircuitBreaker(name = "backendA", fallbackMethod = "fallback")
@Retry(name = "backendA")
public String doSomething() {
    return remoteService.call();
}

public String fallback(Exception ex) {
    return "Fallback response";
}
```

## 12-Factor App

1. Codebase - One repo per service
2. Dependencies - Explicit (pom.xml/build.gradle)
3. Config - Environment variables
4. Backing services - Treat as attached resources
5. Build, release, run - Strict separation
6. Processes - Stateless
7. Port binding - Self-contained
8. Concurrency - Scale via processes
9. Disposability - Fast startup/shutdown
10. Dev/prod parity - Keep environments similar
11. Logs - Treat as event streams
12. Admin processes - Run as one-off processes
