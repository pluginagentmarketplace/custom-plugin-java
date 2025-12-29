import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class StreamExamples {

    record Person(String name, int age, String city) {}

    public static void main(String[] args) {
        var people = List.of(
            new Person("Alice", 30, "NYC"),
            new Person("Bob", 25, "LA"),
            new Person("Charlie", 35, "NYC"),
            new Person("Diana", 28, "LA")
        );

        // Filter and map
        List<String> names = people.stream()
            .filter(p -> p.age() > 26)
            .map(Person::name)
            .sorted()
            .toList();
        System.out.println("Adults: " + names);

        // Group by city
        Map<String, List<Person>> byCity = people.stream()
            .collect(groupingBy(Person::city));
        System.out.println("By city: " + byCity);

        // Average age by city
        Map<String, Double> avgAgeByCity = people.stream()
            .collect(groupingBy(Person::city, averagingInt(Person::age)));
        System.out.println("Avg age: " + avgAgeByCity);

        // Partition by age
        Map<Boolean, List<Person>> partitioned = people.stream()
            .collect(partitioningBy(p -> p.age() >= 30));
        System.out.println("Partitioned: " + partitioned);

        // Statistics
        IntSummaryStatistics stats = people.stream()
            .mapToInt(Person::age)
            .summaryStatistics();
        System.out.println("Stats: " + stats);

        // Parallel stream
        long count = IntStream.range(0, 1_000_000)
            .parallel()
            .filter(n -> isPrime(n))
            .count();
        System.out.println("Primes: " + count);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
            .noneMatch(i -> n % i == 0);
    }
}
