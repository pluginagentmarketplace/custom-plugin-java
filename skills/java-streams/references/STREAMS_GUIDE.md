# Java Streams Complete Guide

## Creating Streams

```java
// From collection
List<String> list = List.of("a", "b", "c");
Stream<String> stream = list.stream();

// From array
String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);

// Stream.of
Stream<String> stream = Stream.of("a", "b", "c");

// Infinite streams
Stream<Integer> infinite = Stream.iterate(0, n -> n + 1);
Stream<Double> random = Stream.generate(Math::random);

// Primitive streams
IntStream ints = IntStream.range(0, 100);
LongStream longs = LongStream.rangeClosed(1, 100);
```

## Collectors

```java
// To List/Set/Map
toList()
toSet()
toMap(keyFunc, valueFunc)
toUnmodifiableList()

// Joining
joining()
joining(", ")
joining(", ", "[", "]")

// Grouping
groupingBy(classifier)
groupingBy(classifier, downstream)
groupingBy(classifier, mapFactory, downstream)

// Partitioning
partitioningBy(predicate)

// Statistics
counting()
summingInt(mapper)
averagingDouble(mapper)
summarizingInt(mapper)

// Min/Max
minBy(comparator)
maxBy(comparator)

// Reducing
reducing(identity, mapper, combiner)
```

## Parallel Streams

```java
// Create parallel stream
list.parallelStream()
stream.parallel()

// When to use
// ✅ Large data sets (10K+ elements)
// ✅ CPU-intensive operations
// ✅ Stateless operations
// ❌ Small data sets
// ❌ I/O operations
// ❌ Order-dependent operations
```
