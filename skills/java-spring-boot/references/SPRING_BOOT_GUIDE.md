# Spring Boot Complete Guide

## Annotations

| Annotation | Purpose |
|------------|---------|
| @SpringBootApplication | Main application class |
| @RestController | REST API controller |
| @Service | Business logic |
| @Repository | Data access |
| @Component | Generic bean |
| @Configuration | Config class |
| @Bean | Bean definition |
| @Autowired | Dependency injection |
| @Value | Property injection |

## Exception Handling

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFound(EntityNotFoundException ex) {
        return new ErrorResponse("NOT_FOUND", ex.getMessage());
    }
}
```

## Profiles

```yaml
# application-dev.yml
spring:
  datasource:
    url: jdbc:h2:mem:devdb

# application-prod.yml
spring:
  datasource:
    url: jdbc:postgresql://prod-db:5432/proddb
```
