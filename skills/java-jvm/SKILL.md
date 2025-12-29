---
name: java-jvm
description: Master JVM internals - memory, garbage collection, and performance tuning
sasmp_version: "1.3.0"
bonded_agent: java-jvm
bond_type: PRIMARY_BOND
---

# Java JVM Skill

## Memory Areas

```
Heap (shared)
├── Young Generation
│   ├── Eden
│   ├── Survivor S0
│   └── Survivor S1
├── Old Generation
└── Metaspace (native memory)

Non-Heap
├── Stack (per thread)
├── Native Method Stack
└── Code Cache
```

## JVM Flags

```bash
# Memory
-Xms512m          # Initial heap size
-Xmx2g            # Maximum heap size
-XX:MetaspaceSize=256m

# GC Selection
-XX:+UseG1GC           # G1 (default Java 9+)
-XX:+UseZGC            # ZGC (low latency)
-XX:+UseShenandoahGC   # Shenandoah

# GC Tuning
-XX:MaxGCPauseMillis=200
-XX:G1HeapRegionSize=16m
-XX:+UseStringDeduplication

# Logging
-Xlog:gc*:file=gc.log:time
```

## GC Comparison

| GC | Latency | Throughput | Use Case |
|----|---------|------------|----------|
| Serial | High | Good | Single core |
| Parallel | Medium | Best | Batch |
| G1 | Low | Good | Default |
| ZGC | Ultra-low | Good | Large heaps |
| Shenandoah | Ultra-low | Good | Low latency |

## Assets

- `jvm-configs/` - JVM configurations

## References

- `JVM_TUNING.md` - Tuning guide
