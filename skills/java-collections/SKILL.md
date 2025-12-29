---
name: java-collections
description: Master Java Collections - List, Set, Map, Queue implementations and usage
sasmp_version: "1.3.0"
bonded_agent: java-collections
bond_type: PRIMARY_BOND
---

# Java Collections Skill

## Collection Hierarchy

```
Collection
├── List (ordered, duplicates allowed)
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector (legacy)
├── Set (no duplicates)
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet (sorted)
└── Queue/Deque
    ├── PriorityQueue
    ├── ArrayDeque
    └── LinkedList

Map (key-value pairs)
├── HashMap
├── LinkedHashMap
├── TreeMap (sorted by key)
└── ConcurrentHashMap
```

## Choosing Collections

| Need | Use |
|------|-----|
| Fast random access | ArrayList |
| Fast insert/delete | LinkedList |
| No duplicates, unordered | HashSet |
| No duplicates, sorted | TreeSet |
| Key-value, unordered | HashMap |
| Key-value, sorted | TreeMap |
| FIFO queue | ArrayDeque |
| Priority queue | PriorityQueue |
| Thread-safe map | ConcurrentHashMap |

## Common Operations

```java
// List
List<String> list = new ArrayList<>();
list.add("item");
list.get(0);
list.remove("item");
list.contains("item");

// Set
Set<String> set = new HashSet<>();
set.add("item");
set.contains("item");
set.remove("item");

// Map
Map<String, Integer> map = new HashMap<>();
map.put("key", 1);
map.get("key");
map.getOrDefault("key", 0);
map.computeIfAbsent("key", k -> expensiveComputation());
```

## Assets

- `examples/` - Collection examples
- `comparisons/` - Performance comparisons

## References

- `COLLECTIONS_GUIDE.md` - Complete reference
