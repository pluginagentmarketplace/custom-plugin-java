---
name: java-debug
description: Debug Java applications - analyze errors, memory issues, performance
allowed-tools: Bash, Read, WebSearch
version: "3.0.0"

# Input Validation
parameters:
  error_type:
    type: string
    enum: [OutOfMemoryError, ClassNotFoundException, NoSuchMethodError, StackOverflowError, NullPointerException, all]
    description: Specific error type to debug
  pid:
    type: integer
    description: Process ID for live debugging
---

# Java Debug Command

Diagnose and troubleshoot Java application issues.

## What This Command Does

1. **Error Analysis** - Parse and explain stack traces
2. **Common Errors** - Identify known issue patterns
3. **JVM Diagnostics** - Check memory, threads, GC
4. **Solutions** - Provide targeted fixes
5. **Prevention** - Best practices to avoid issues

## Usage

```bash
/java-debug                       # Analyze current error
/java-debug OutOfMemoryError      # Debug OOM specifically
/java-debug --pid 12345           # Debug running process
/java-debug ClassNotFoundException # Debug classpath issues
```

## Common Issues

### OutOfMemoryError

**Causes:**
- Heap too small
- Memory leak
- Large objects

**Diagnosis:**
```bash
# Heap dump
jmap -dump:format=b,file=heap.hprof <pid>

# GC logs
-Xlog:gc*:file=gc.log

# Heap settings
java -Xms512m -Xmx2g -XX:+HeapDumpOnOutOfMemoryError
```

### ClassNotFoundException

**Causes:**
- Missing dependency
- Wrong classpath
- Shading issues

**Diagnosis:**
```bash
# Check classpath
java -cp . -verbose:class MyApp

# Dependency tree
mvn dependency:tree
gradle dependencies
```

### NoSuchMethodError

**Causes:**
- Version conflict
- Incompatible dependency
- Classpath order

**Diagnosis:**
```bash
# Find duplicates
mvn dependency:tree -Dincludes=groupId:artifactId
gradle dependencyInsight --dependency name
```

### StackOverflowError

**Causes:**
- Infinite recursion
- Deep call stack
- Circular references

**Fix:**
- Add base case to recursion
- Use iteration instead
- Increase stack size: `-Xss2m`

### NullPointerException

**Causes:**
- Null reference access
- Missing initialization
- Bad API return

**Fix:**
- Use Optional
- Add null checks
- Use @NonNull annotations

## JVM Diagnostic Commands

```bash
# Thread dump
jstack -l <pid>

# Heap info
jmap -heap <pid>

# GC stats
jstat -gcutil <pid> 1000

# Flight recording
jcmd <pid> JFR.start duration=60s filename=recording.jfr

# Full diagnostics
jcmd <pid> VM.info
```

## Troubleshooting Decision Tree

```
Error occurred?
├── OutOfMemoryError
│   ├── Heap? → Increase -Xmx, check leaks
│   └── Metaspace? → Increase -XX:MaxMetaspaceSize
├── ClassNotFoundException
│   ├── At runtime? → Check classpath
│   └── At startup? → Missing dependency
├── NoSuchMethodError
│   └── Check for version conflicts
└── Performance issue
    ├── High CPU? → Profile with async-profiler
    └── Slow response? → Check GC pauses
```

## Exit Codes

| Code | Meaning |
|------|---------|
| 0 | Diagnosis complete |
| 1 | Process not found |
| 2 | Insufficient permissions |

## Related Commands

- `/java-build` - Build project
- `/java-check` - Check environment
