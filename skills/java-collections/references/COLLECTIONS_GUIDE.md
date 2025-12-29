# Java Collections Complete Guide

## Performance Comparison

### List Implementations

| Operation | ArrayList | LinkedList |
|-----------|-----------|------------|
| get(index) | O(1) | O(n) |
| add(end) | O(1)* | O(1) |
| add(index) | O(n) | O(n)** |
| remove(index) | O(n) | O(n)** |
| contains | O(n) | O(n) |

*Amortized, **Finding position is O(n), actual insert is O(1)

### Set Implementations

| Operation | HashSet | LinkedHashSet | TreeSet |
|-----------|---------|---------------|---------|
| add | O(1) | O(1) | O(log n) |
| remove | O(1) | O(1) | O(log n) |
| contains | O(1) | O(1) | O(log n) |
| Order | None | Insertion | Sorted |

### Map Implementations

| Operation | HashMap | LinkedHashMap | TreeMap |
|-----------|---------|---------------|---------|
| put | O(1) | O(1) | O(log n) |
| get | O(1) | O(1) | O(log n) |
| remove | O(1) | O(1) | O(log n) |
| Order | None | Insertion | Key order |

## Best Practices

### Prefer Interfaces
```java
// GOOD
List<String> list = new ArrayList<>();
Map<K, V> map = new HashMap<>();

// BAD
ArrayList<String> list = new ArrayList<>();
```

### Initialize with Capacity
```java
// For known sizes
List<String> list = new ArrayList<>(1000);
Map<K, V> map = new HashMap<>(1000);
```

### Use Factory Methods (Java 9+)
```java
List<String> list = List.of("a", "b", "c");
Set<Integer> set = Set.of(1, 2, 3);
Map<String, Integer> map = Map.of("one", 1, "two", 2);
```

### Thread-Safe Collections
```java
// For concurrent access
Map<K, V> map = new ConcurrentHashMap<>();
List<String> list = new CopyOnWriteArrayList<>();

// Synchronized wrappers
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

## Common Patterns

### Group by
```java
Map<String, List<Person>> byCity = people.stream()
    .collect(Collectors.groupingBy(Person::getCity));
```

### Partition
```java
Map<Boolean, List<Person>> partitioned = people.stream()
    .collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
```

### Frequency Map
```java
Map<String, Long> frequency = words.stream()
    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
```
