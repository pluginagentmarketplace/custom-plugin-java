---
name: java-gradle
description: Master Gradle - modern build automation with Kotlin/Groovy DSL
sasmp_version: "1.3.0"
bonded_agent: java-build-tools
bond_type: SECONDARY_BOND
---

# Java Gradle Skill

## Build Script (Kotlin DSL)

```kotlin
// build.gradle.kts
plugins {
    id("java")
    id("org.springframework.boot") version "3.2.0"
}

group = "com.example"
version = "1.0.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}
```

## Common Commands

```bash
gradle build        # Build project
gradle test         # Run tests
gradle bootRun      # Run Spring Boot
gradle clean        # Clean build
gradle dependencies # Show dependencies
gradle tasks        # List all tasks
```

## Assets

- `build-templates/` - Build script templates
- `plugins/` - Plugin configurations

## References

- `GRADLE_GUIDE.md` - Complete reference
