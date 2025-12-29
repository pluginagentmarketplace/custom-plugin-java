/**
 * Builder Pattern Example
 * Creates immutable objects with complex construction
 */
public class User {
    private final String name;
    private final String email;
    private final int age;
    private final String phone;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters only (immutable)
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public static Builder builder(String name, String email) {
        return new Builder(name, email);
    }

    public static class Builder {
        // Required
        private final String name;
        private final String email;

        // Optional
        private int age = 0;
        private String phone = "";
        private String address = "";

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user = User.builder("John", "john@example.com")
                .age(30)
                .phone("555-1234")
                .address("123 Main St")
                .build();

        System.out.println(user.getName());
    }
}
