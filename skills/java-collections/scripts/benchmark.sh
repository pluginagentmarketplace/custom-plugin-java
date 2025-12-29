#!/bin/bash
# Simple collection benchmark

cat > /tmp/CollectionBenchmark.java << 'EOF'
import java.util.*;

public class CollectionBenchmark {
    private static final int N = 1_000_000;

    public static void main(String[] args) {
        benchmarkList();
        benchmarkSet();
        benchmarkMap();
    }

    static void benchmarkList() {
        System.out.println("=== List Benchmark ===");

        // ArrayList add
        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long time = (System.nanoTime() - start) / 1_000_000;
        System.out.println("ArrayList add: " + time + "ms");

        // LinkedList add
        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        time = (System.nanoTime() - start) / 1_000_000;
        System.out.println("LinkedList add: " + time + "ms");

        // Random access
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) arrayList.get(N/2);
        time = (System.nanoTime() - start) / 1_000_000;
        System.out.println("ArrayList get(middle): " + time + "ms");
    }

    static void benchmarkSet() {
        System.out.println("\n=== Set Benchmark ===");

        Set<Integer> hashSet = new HashSet<>();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) hashSet.add(i);
        long time = (System.nanoTime() - start) / 1_000_000;
        System.out.println("HashSet add: " + time + "ms");

        Set<Integer> treeSet = new TreeSet<>();
        start = System.nanoTime();
        for (int i = 0; i < N; i++) treeSet.add(i);
        time = (System.nanoTime() - start) / 1_000_000;
        System.out.println("TreeSet add: " + time + "ms");
    }

    static void benchmarkMap() {
        System.out.println("\n=== Map Benchmark ===");

        Map<Integer, Integer> hashMap = new HashMap<>();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) hashMap.put(i, i);
        long time = (System.nanoTime() - start) / 1_000_000;
        System.out.println("HashMap put: " + time + "ms");
    }
}
EOF

cd /tmp
javac CollectionBenchmark.java
java CollectionBenchmark
rm CollectionBenchmark.*
