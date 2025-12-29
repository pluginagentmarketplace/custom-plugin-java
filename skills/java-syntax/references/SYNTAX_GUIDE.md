# Java Syntax Complete Guide

## Variables

```java
// Local variable type inference (Java 10+)
var name = "Java";
var list = new ArrayList<String>();

// Final (constants)
final int MAX_SIZE = 100;
```

## Operators

| Category | Operators |
|----------|-----------|
| Arithmetic | `+ - * / % ++ --` |
| Relational | `== != > < >= <=` |
| Logical | `&& \|\| !` |
| Bitwise | `& \| ^ ~ << >> >>>` |
| Assignment | `= += -= *= /= %=` |
| Ternary | `? :` |
| instanceof | `instanceof` |

## String Handling

```java
// Text blocks (Java 15+)
String html = """
    <html>
        <body>Hello</body>
    </html>
    """;

// String methods
String s = "Hello, World!";
s.length();              // 13
s.substring(0, 5);       // "Hello"
s.split(", ");           // ["Hello", "World!"]
s.strip();               // Trim whitespace
s.isBlank();             // Check if empty/whitespace

// Formatted strings
String formatted = "Name: %s, Age: %d".formatted("John", 25);
```

## Control Structures

### Enhanced Switch (Java 14+)

```java
// Expression form
int numDays = switch (month) {
    case JANUARY, MARCH, MAY, JULY,
         AUGUST, OCTOBER, DECEMBER -> 31;
    case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
    case FEBRUARY -> year % 4 == 0 ? 29 : 28;
};

// Statement form with yield
String description = switch (code) {
    case 200 -> "OK";
    case 404 -> "Not Found";
    default -> {
        log("Unknown code: " + code);
        yield "Unknown";
    }
};
```

### Pattern Matching (Java 17+)

```java
// Type patterns
if (obj instanceof String s && s.length() > 5) {
    System.out.println(s.toUpperCase());
}

// Record patterns (Java 21)
record Point(int x, int y) {}
if (obj instanceof Point(int x, int y)) {
    System.out.println("x=" + x + ", y=" + y);
}
```

## Exception Handling

```java
try (var reader = new BufferedReader(new FileReader("file.txt"))) {
    // Try-with-resources
    String line = reader.readLine();
} catch (IOException | RuntimeException e) {
    // Multi-catch
    log(e.getMessage());
} finally {
    cleanup();
}
```
