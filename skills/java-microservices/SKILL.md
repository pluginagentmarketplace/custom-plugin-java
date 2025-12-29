---
name: java-microservices
description: Master Java microservices - patterns, communication, and cloud-native development
sasmp_version: "1.3.0"
bonded_agent: java-spring
bond_type: SECONDARY_BOND
---

# Java Microservices Skill

## Architecture Patterns

```
Client → API Gateway → Service Discovery
           ↓
    ┌──────┴──────┐
    ↓             ↓
 Service A    Service B
    ↓             ↓
 Database A   Database B
```

## Spring Cloud Components

| Component | Purpose |
|-----------|---------|
| Spring Cloud Gateway | API Gateway |
| Eureka | Service Discovery |
| Config Server | Centralized Config |
| OpenFeign | HTTP Client |
| Resilience4j | Circuit Breaker |
| Sleuth + Zipkin | Distributed Tracing |

## Communication

```java
// Feign Client
@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/api/users/{id}")
    User getUser(@PathVariable Long id);
}

// Circuit Breaker
@CircuitBreaker(name = "userService", fallbackMethod = "fallback")
public User getUser(Long id) {
    return userClient.getUser(id);
}
```

## Docker & Kubernetes

```dockerfile
FROM eclipse-temurin:21-jre
COPY target/app.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]
```

## Assets

- `docker/` - Containerization
- `k8s/` - Kubernetes manifests

## References

- `MICROSERVICES_GUIDE.md` - Complete reference
