---
name: java-junit
description: Master JUnit 5 and Mockito - unit testing, mocking, and TDD
sasmp_version: "1.3.0"
bonded_agent: java-testing
bond_type: PRIMARY_BOND
---

# Java JUnit Skill

## JUnit 5 Test

```java
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("Should find user by id")
    void shouldFindUserById() {
        // Given
        User expected = new User(1L, "John");
        when(userRepository.findById(1L))
            .thenReturn(Optional.of(expected));

        // When
        User result = userService.findById(1L);

        // Then
        assertThat(result).isEqualTo(expected);
        verify(userRepository).findById(1L);
    }

    @Test
    void shouldThrowWhenUserNotFound() {
        when(userRepository.findById(anyLong()))
            .thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class,
            () -> userService.findById(999L));
    }
}
```

## Assertions (AssertJ)

```java
assertThat(result).isNotNull();
assertThat(result.getName()).isEqualTo("John");
assertThat(list).hasSize(3).contains("a", "b");
assertThat(number).isGreaterThan(10);
```

## Assets

- `test-templates/` - Test templates

## References

- `TESTING_GUIDE.md` - Complete reference
