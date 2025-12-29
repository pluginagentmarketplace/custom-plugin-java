import java.util.*;

/**
 * Java Collections Examples
 */
public class CollectionExamples {

    public static void main(String[] args) {
        // Immutable collections (Java 9+)
        List<String> immutableList = List.of("a", "b", "c");
        Set<Integer> immutableSet = Set.of(1, 2, 3);
        Map<String, Integer> immutableMap = Map.of("one", 1, "two", 2);

        // ArrayList - fast random access
        List<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add(1, "inserted");  // Insert at index

        // LinkedList - fast insert/remove
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("first");
        linkedList.addLast("last");
        linkedList.pollFirst();  // Remove and return first

        // HashSet - no duplicates
        Set<String> hashSet = new HashSet<>();
        hashSet.add("unique");
        hashSet.add("unique");  // Ignored
        System.out.println(hashSet.size());  // 1

        // TreeSet - sorted
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(List.of(3, 1, 4, 1, 5));
        System.out.println(treeSet);  // [1, 3, 4, 5]

        // HashMap - key-value
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.computeIfAbsent("three", k -> 3);

        // Iteration
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // PriorityQueue - min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(List.of(3, 1, 4, 1, 5));
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");  // 1 1 3 4 5
        }
    }
}
