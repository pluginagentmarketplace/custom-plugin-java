---
description: Build Java project with Maven or Gradle
allowed-tools: Bash, Read
---

# Java Build Command

Build the Java project and run tests.

## What This Command Does

1. Detects build tool (Maven/Gradle)
2. Runs clean build
3. Executes tests
4. Reports build status
5. Shows test results summary

## Usage

```
/java-build
/java-build --skip-tests
/java-build --package
```

## Options

- `--skip-tests` - Build without running tests
- `--package` - Create JAR/WAR
- `--install` - Install to local repository
