# Jakarta EE Guide

## CDI (Context and Dependency Injection)

```java
// Service bean
@ApplicationScoped
public class UserService {
    @Inject
    private UserRepository repository;
}

// Qualifier
@Qualifier
@Retention(RUNTIME)
public @interface Premium {}

@Premium
@ApplicationScoped
public class PremiumUserService extends UserService {}
```

## JPA Relationships

```java
@Entity
public class Order {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
}
```

## Runtimes

| Runtime | Vendor |
|---------|--------|
| Payara | Payara Foundation |
| WildFly | Red Hat |
| Open Liberty | IBM |
| GlassFish | Eclipse |
