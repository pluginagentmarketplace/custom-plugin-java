---
name: java-streams
description: Master Java Stream API - functional programming, pipelines, and data processing
sasmp_version: "1.3.0"
bonded_agent: java-collections
bond_type: SECONDARY_BOND
---

# Java Streams Skill

## Stream Pipeline

```java
List<String> result = items.stream()
    .filter(item -> item.startsWith("A"))   // Intermediate
    .map(String::toUpperCase)               // Intermediate
    .sorted()                               // Intermediate
    .limit(10)                              // Intermediate
    .collect(Collectors.toList());          // Terminal
```

## Common Operations

### Intermediate Operations
```java
// Filter
stream.filter(x -> x > 10)

// Map
stream.map(String::toUpperCase)
stream.mapToInt(String::length)

// FlatMap
stream.flatMap(list -> list.stream())

// Sorted
stream.sorted()
stream.sorted(Comparator.reverseOrder())

// Distinct
stream.distinct()

// Limit/Skip
stream.limit(10).skip(5)
```

### Terminal Operations
```java
// Collect
collect(Collectors.toList())
collect(Collectors.toSet())
collect(Collectors.joining(", "))
collect(Collectors.groupingBy(Person::getCity))

// Reduce
reduce(0, Integer::sum)
reduce(Integer::max)

// Find
findFirst()
findAny()

// Match
anyMatch(predicate)
allMatch(predicate)
noneMatch(predicate)

// Count/ForEach
count()
forEach(System.out::println)
```

## Assets

- `examples/` - Stream examples
- `patterns/` - Common patterns

## References

- `STREAMS_GUIDE.md` - Complete reference
