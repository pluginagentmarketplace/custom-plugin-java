# Java Concurrency Guide

## Thread States

```
NEW → RUNNABLE → BLOCKED/WAITING/TIMED_WAITING → TERMINATED
```

## Virtual Threads (Java 21+)

```java
// Platform thread (heavyweight)
Thread platformThread = new Thread(() -> task());

// Virtual thread (lightweight)
Thread virtualThread = Thread.ofVirtual().start(() -> task());

// Executor
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    IntStream.range(0, 100_000).forEach(i -> {
        executor.submit(() -> handleRequest(i));
    });
}
```

## Structured Concurrency (Java 21 Preview)

```java
try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
    Future<String> user = scope.fork(() -> fetchUser());
    Future<Integer> order = scope.fork(() -> fetchOrder());

    scope.join();
    scope.throwIfFailed();

    return new Response(user.resultNow(), order.resultNow());
}
```

## Common Patterns

### Producer-Consumer
Use `BlockingQueue`

### Read-Write Lock
```java
ReadWriteLock rwLock = new ReentrantReadWriteLock();
rwLock.readLock().lock();  // Multiple readers
rwLock.writeLock().lock(); // Exclusive writer
```

### CountDownLatch
```java
CountDownLatch latch = new CountDownLatch(3);
// Workers call latch.countDown()
latch.await();  // Wait for all
```
