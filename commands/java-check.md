---
name: java-check
description: Check Java environment - JDK, Maven, Gradle versions and configuration
allowed-tools: Bash, Read
version: "3.0.0"

# Input Validation
parameters:
  verbose:
    type: boolean
    default: false
    description: Show detailed output
---

# Java Check Command

Verify Java development environment is properly configured.

## What This Command Does

1. **JDK Check** - Verify Java version (recommend 17 or 21)
2. **JAVA_HOME** - Validate environment variable
3. **Maven Check** - Verify installation and version
4. **Gradle Check** - Verify installation and version
5. **Environment Summary** - Display configuration status

## Usage

```bash
/java-check            # Quick check
/java-check --verbose  # Detailed output
```

## Expected Output

```
=== Java Environment Check ===

JDK:
  ✓ Version: 21.0.1
  ✓ JAVA_HOME: /usr/lib/jvm/java-21
  ✓ javac available

Build Tools:
  ✓ Maven: 3.9.6
  ✓ Gradle: 8.5

Status: Environment Ready
```

## Troubleshooting

| Issue | Cause | Solution |
|-------|-------|----------|
| java not found | Not in PATH | Add JAVA_HOME/bin to PATH |
| JAVA_HOME not set | Missing variable | Export JAVA_HOME |
| Maven not found | Not installed | Install via sdkman or apt |
| Wrong Java version | Multiple JDKs | Use update-alternatives |

## Exit Codes

| Code | Meaning |
|------|---------|
| 0 | Environment OK |
| 1 | Java not found |
| 2 | Build tools missing |

## Related Commands

- `/java-new` - Create new project
- `/java-build` - Build project
