# OOP and SOLID Principles

## SOLID Principles

### S - Single Responsibility Principle
```java
// BAD: Multiple responsibilities
class UserService {
    void createUser(User u) { /* ... */ }
    void sendEmail(String to) { /* ... */ }  // Should be separate
    void generateReport() { /* ... */ }       // Should be separate
}

// GOOD: Single responsibility
class UserService {
    void createUser(User u) { /* ... */ }
}
class EmailService {
    void sendEmail(String to) { /* ... */ }
}
```

### O - Open/Closed Principle
```java
// Open for extension, closed for modification
public interface PaymentProcessor {
    void process(Payment payment);
}

public class CreditCardProcessor implements PaymentProcessor { /* ... */ }
public class PayPalProcessor implements PaymentProcessor { /* ... */ }
// Add new processors without modifying existing code
```

### L - Liskov Substitution Principle
```java
// Subtypes must be substitutable for base types
class Rectangle {
    protected int width, height;
    public void setWidth(int w) { width = w; }
    public void setHeight(int h) { height = h; }
    public int area() { return width * height; }
}

// BAD: Square violates LSP
class Square extends Rectangle {
    @Override
    public void setWidth(int w) { width = height = w; }  // Breaks expectations
}

// GOOD: Use composition or separate hierarchy
```

### I - Interface Segregation Principle
```java
// BAD: Fat interface
interface Worker {
    void work();
    void eat();
    void sleep();
}

// GOOD: Segregated interfaces
interface Workable { void work(); }
interface Eatable { void eat(); }
interface Sleepable { void sleep(); }
```

### D - Dependency Inversion Principle
```java
// Depend on abstractions, not concretions
class OrderService {
    private final PaymentProcessor processor;  // Interface, not concrete

    public OrderService(PaymentProcessor processor) {
        this.processor = processor;  // Injected dependency
    }
}
```

## Design Patterns

### Creational
- **Singleton**: Single instance
- **Factory**: Object creation
- **Builder**: Complex object construction
- **Prototype**: Cloning objects

### Structural
- **Adapter**: Interface compatibility
- **Decorator**: Add behavior dynamically
- **Facade**: Simplified interface
- **Proxy**: Access control

### Behavioral
- **Strategy**: Algorithm selection
- **Observer**: Event handling
- **Command**: Action encapsulation
- **Template Method**: Algorithm skeleton
