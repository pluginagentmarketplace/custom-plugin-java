---
name: java-jakarta-ee
description: Master Jakarta EE - enterprise Java, CDI, JPA, and JAX-RS
sasmp_version: "1.3.0"
bonded_agent: java-spring
bond_type: SECONDARY_BOND
---

# Java Jakarta EE Skill

## Core Specifications

| Spec | Purpose |
|------|---------|
| Jakarta CDI | Dependency Injection |
| Jakarta Persistence (JPA) | ORM |
| Jakarta RESTful Web Services | REST API |
| Jakarta Servlet | HTTP handling |
| Jakarta Bean Validation | Input validation |
| Jakarta JSON Binding | JSON processing |

## JAX-RS Example

```java
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    private UserService userService;

    @GET
    public List<User> getAll() {
        return userService.findAll();
    }

    @GET
    @Path("/{id}")
    public User getById(@PathParam("id") Long id) {
        return userService.findById(id);
    }

    @POST
    public Response create(User user) {
        User created = userService.create(user);
        return Response.status(Status.CREATED)
            .entity(created).build();
    }
}
```

## Assets

- `examples/` - Jakarta EE examples

## References

- `JAKARTA_EE_GUIDE.md` - Complete reference
