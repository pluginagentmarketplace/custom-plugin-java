---
name: java-build
description: Build Java project with Maven or Gradle - compile, test, package
allowed-tools: Bash, Read
version: "3.0.0"

# Input Validation
parameters:
  skip_tests:
    type: boolean
    default: false
    description: Skip test execution
  goal:
    type: string
    enum: [compile, test, package, install, deploy]
    default: package
  profile:
    type: string
    description: Build profile to activate
---

# Java Build Command

Build the Java project and run tests.

## What This Command Does

1. **Detect Build Tool** - Find Maven or Gradle wrapper
2. **Clean Build** - Remove previous artifacts
3. **Compile** - Compile source code
4. **Test** - Run unit tests
5. **Package** - Create JAR/WAR
6. **Report** - Show build summary

## Usage

```bash
/java-build                    # Build and test
/java-build --skip-tests       # Build without tests
/java-build --package          # Create JAR/WAR
/java-build --install          # Install to local repo
/java-build --profile prod     # Use production profile
```

## Build Goals

| Goal | Maven | Gradle | Description |
|------|-------|--------|-------------|
| compile | compile | classes | Compile sources |
| test | test | test | Run tests |
| package | package | jar | Create artifact |
| install | install | publishToMavenLocal | Install locally |

## Options

| Option | Description |
|--------|-------------|
| `--skip-tests` | Build without tests |
| `--package` | Create JAR/WAR |
| `--install` | Install to local repository |
| `--profile <name>` | Activate build profile |
| `--debug` | Enable debug output |

## Output Example

```
=== Java Build ===

[INFO] Building my-app 1.0.0-SNAPSHOT
[INFO] Compiling 42 source files
[INFO] Running 28 tests

Tests:
  ✓ 28 tests passed
  ✗ 0 tests failed
  ⊘ 2 tests skipped

[INFO] Building jar: target/my-app-1.0.0-SNAPSHOT.jar

BUILD SUCCESS (32s)
```

## Troubleshooting

| Issue | Cause | Solution |
|-------|-------|----------|
| Compilation error | Syntax error | Check error line |
| Test failure | Assertion failed | Review test output |
| Dependency not found | Missing repo | Check repositories |
| Out of memory | Heap too small | Set MAVEN_OPTS |

## Exit Codes

| Code | Meaning |
|------|---------|
| 0 | Build success |
| 1 | Compilation failed |
| 2 | Tests failed |

## Related Commands

- `/java-check` - Verify environment
- `/java-debug` - Debug issues
