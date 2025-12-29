# Gradle Complete Guide

## Kotlin vs Groovy DSL

| Feature | Kotlin DSL | Groovy DSL |
|---------|------------|------------|
| Type safety | ✅ | ❌ |
| IDE support | Better | Good |
| Syntax | Stricter | Flexible |
| Performance | Slightly slower | Faster |

## Multi-Project Build

```kotlin
// settings.gradle.kts
rootProject.name = "my-project"
include("core", "api", "web")

// build.gradle.kts (root)
subprojects {
    apply(plugin = "java")
    repositories { mavenCentral() }
}
```

## Custom Tasks

```kotlin
tasks.register("hello") {
    doLast {
        println("Hello, Gradle!")
    }
}

tasks.register<Copy>("copyDocs") {
    from("src/docs")
    into("build/docs")
}
```
