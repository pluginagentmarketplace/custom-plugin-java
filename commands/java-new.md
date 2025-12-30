---
name: java-new
description: Create a new Java project with Maven or Gradle
allowed-tools: Bash, Read, Write
version: "3.0.0"

# Input Validation
parameters:
  project_name:
    type: string
    required: true
    pattern: "^[a-z][a-z0-9-]*$"
    description: Project name (lowercase, hyphens allowed)
  build_tool:
    type: string
    enum: [maven, gradle]
    default: maven
  framework:
    type: string
    enum: [plain, spring-boot, quarkus, library]
    default: plain
  java_version:
    type: string
    default: "21"
    enum: ["17", "21"]
---

# Java New Command

Create a new Java project with proper structure and dependencies.

## What This Command Does

1. **Project Type Selection** - Choose Maven or Gradle
2. **Framework Selection** - Spring Boot, Quarkus, or plain Java
3. **Directory Structure** - Create standard Java layout
4. **Build Configuration** - Generate pom.xml or build.gradle.kts
5. **Git Init** - Initialize git repository with .gitignore

## Usage

```bash
/java-new my-app                        # Plain Maven project
/java-new my-app --spring-boot          # Spring Boot with Maven
/java-new my-app --gradle --spring-boot # Spring Boot with Gradle
/java-new my-lib --library              # Library project
```

## Project Types

### Plain Java
- Basic Maven/Gradle project
- JUnit 5 for testing
- No framework dependencies

### Spring Boot
- Spring Boot 3.x starter
- Web, actuator included
- Application class generated

### Library
- No main class
- Configured for publishing
- Test dependencies only

### Multi-module (advanced)
- Parent POM with modules
- Shared dependencies
- Separate subprojects

## Generated Structure

```
my-app/
├── pom.xml (or build.gradle.kts)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/myapp/
│   │   │       └── Application.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── java/
│           └── com/example/myapp/
│               └── ApplicationTest.java
├── .gitignore
└── README.md
```

## Options

| Option | Description |
|--------|-------------|
| `--maven` | Use Maven (default) |
| `--gradle` | Use Gradle with Kotlin DSL |
| `--spring-boot` | Include Spring Boot starter |
| `--library` | Create library project |
| `--java 17` | Specify Java version |

## Exit Codes

| Code | Meaning |
|------|---------|
| 0 | Project created |
| 1 | Invalid project name |
| 2 | Directory exists |

## Related Commands

- `/java-check` - Verify environment
- `/java-build` - Build project
