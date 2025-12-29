---
name: java-syntax
description: Master Java syntax - data types, operators, control flow, and language basics
sasmp_version: "1.3.0"
bonded_agent: java-fundamentals
bond_type: PRIMARY_BOND
---

# Java Syntax Skill

## Primitive Types

```java
// Numeric types
byte b = 127;           // 8-bit, -128 to 127
short s = 32767;        // 16-bit
int i = 2147483647;     // 32-bit
long l = 9223372036854775807L;  // 64-bit

// Floating point
float f = 3.14f;        // 32-bit
double d = 3.14159265;  // 64-bit

// Character and Boolean
char c = 'A';           // 16-bit Unicode
boolean flag = true;    // true or false
```

## Control Flow

```java
// Switch expression (Java 14+)
String result = switch (day) {
    case MONDAY, FRIDAY -> "Work day";
    case SATURDAY, SUNDAY -> "Weekend";
    default -> "Unknown";
};

// Pattern matching (Java 17+)
if (obj instanceof String s) {
    System.out.println(s.length());
}
```

## Modern Java Features

| Feature | Java Version |
|---------|--------------|
| var keyword | 10 |
| Text blocks | 15 |
| Records | 16 |
| Pattern matching | 17 |
| Sealed classes | 17 |
| Virtual threads | 21 |

## Assets

- `code-templates/` - Boilerplate code
- `cheatsheets/` - Quick reference

## References

- `SYNTAX_GUIDE.md` - Complete reference
