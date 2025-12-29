---
description: Create a new Java project with Maven or Gradle
allowed-tools: Bash, Read, Write
---

# Java New Command

Create a new Java project with proper structure and dependencies.

## What This Command Does

1. Asks for project type (Maven/Gradle)
2. Selects framework (Spring Boot, Plain Java, Jakarta EE)
3. Creates project structure
4. Sets up dependencies
5. Configures build script

## Usage

```
/java-new [project-name]
/java-new my-app --spring-boot
/java-new api-service --gradle
```

## Project Types

- **Plain Java** - Simple Maven/Gradle project
- **Spring Boot** - Web application with Spring
- **Library** - Reusable library project
- **Multi-module** - Parent with child modules
