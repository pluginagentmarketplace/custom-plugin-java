---
name: java-concurrency
description: Master Java concurrency - threads, executors, CompletableFuture, and synchronization
sasmp_version: "1.3.0"
bonded_agent: java-concurrency
bond_type: PRIMARY_BOND
---

# Java Concurrency Skill

## Thread Basics

```java
// Create thread
Thread thread = new Thread(() -> {
    System.out.println("Running in: " + Thread.currentThread().getName());
});
thread.start();

// Wait for completion
thread.join();
```

## ExecutorService

```java
// Fixed thread pool
ExecutorService executor = Executors.newFixedThreadPool(4);

// Submit task
Future<String> future = executor.submit(() -> "Result");
String result = future.get();  // Blocking

// Virtual threads (Java 21+)
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> processTask());
}
```

## CompletableFuture

```java
CompletableFuture.supplyAsync(() -> fetchData())
    .thenApply(data -> transform(data))
    .thenAccept(result -> save(result))
    .exceptionally(ex -> handleError(ex));

// Combine multiple
CompletableFuture.allOf(future1, future2, future3)
    .thenRun(() -> allDone());
```

## Synchronization

```java
// synchronized block
synchronized (lock) {
    // critical section
}

// ReentrantLock
Lock lock = new ReentrantLock();
lock.lock();
try {
    // critical section
} finally {
    lock.unlock();
}

// Atomic variables
AtomicInteger counter = new AtomicInteger(0);
counter.incrementAndGet();
```

## Assets

- `examples/` - Concurrency patterns

## References

- `CONCURRENCY_GUIDE.md` - Complete reference
