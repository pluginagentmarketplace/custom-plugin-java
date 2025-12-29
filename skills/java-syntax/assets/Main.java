/**
 * Java Application Template
 * Modern Java 21+ features
 */
public class Main {

    public static void main(String[] args) {
        // Text block (Java 15+)
        String json = """
            {
                "name": "Java",
                "version": 21
            }
            """;
        System.out.println(json);

        // Pattern matching for switch (Java 21)
        Object obj = "Hello";
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "null";
            default -> "Unknown";
        };
        System.out.println(result);

        // Records
        record Person(String name, int age) {}
        var person = new Person("Alice", 30);
        System.out.println(person);

        // Var keyword (Java 10+)
        var numbers = java.util.List.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
    }
}
