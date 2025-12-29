# JVM Tuning Guide

## Container-Aware Settings (Java 17+)

```bash
# JVM automatically detects container limits
java -XX:+UseContainerSupport \
     -XX:MaxRAMPercentage=75.0 \
     -jar app.jar
```

## Profiling Tools

| Tool | Purpose |
|------|---------|
| jcmd | JVM diagnostics |
| jmap | Heap dump |
| jstack | Thread dump |
| jstat | GC statistics |
| async-profiler | CPU/Memory profiling |
| JFR | Flight Recorder |

## Common Issues

### OOM: Heap
```bash
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=/path/to/dump
```

### Long GC Pauses
```bash
-XX:MaxGCPauseMillis=100
-XX:+UseZGC  # or Shenandoah
```

### High CPU (GC)
```bash
jstat -gc <pid> 1000  # Monitor GC
# Consider larger heap or different GC
```
