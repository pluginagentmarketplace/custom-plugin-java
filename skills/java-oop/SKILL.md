---
name: java-oop
description: Master Java OOP - classes, inheritance, polymorphism, interfaces, and design patterns
sasmp_version: "1.3.0"
bonded_agent: java-oop
bond_type: PRIMARY_BOND
---

# Java OOP Skill

## Class Anatomy

```java
public class Person {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Static factory method
    public static Person of(String name, int age) {
        return new Person(name, age);
    }

    @Override
    public String toString() {
        return "Person[name=%s, age=%d]".formatted(name, age);
    }
}
```

## Records (Java 16+)

```java
// Immutable data carrier
public record Person(String name, int age) {
    // Compact constructor for validation
    public Person {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
    }
}
```

## Sealed Classes (Java 17+)

```java
public sealed interface Shape permits Circle, Rectangle, Triangle {
    double area();
}

public final class Circle implements Shape {
    private final double radius;
    public double area() { return Math.PI * radius * radius; }
}
```

## Assets

- `patterns/` - Design pattern examples
- `templates/` - Class templates

## References

- `OOP_PRINCIPLES.md` - SOLID principles
