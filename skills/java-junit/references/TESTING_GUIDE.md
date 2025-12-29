# Java Testing Guide

## JUnit 5 Annotations

| Annotation | Purpose |
|------------|---------|
| @Test | Test method |
| @BeforeEach | Before each test |
| @AfterEach | After each test |
| @BeforeAll | Before all tests (static) |
| @DisplayName | Custom test name |
| @Disabled | Skip test |
| @Nested | Nested test class |
| @ParameterizedTest | Parameterized test |

## Mockito

```java
// Create mock
UserRepository mock = mock(UserRepository.class);

// Stub
when(mock.findById(1L)).thenReturn(Optional.of(user));
when(mock.findAll()).thenThrow(new RuntimeException());

// Verify
verify(mock).findById(1L);
verify(mock, times(2)).save(any());
verify(mock, never()).delete(any());
```

## TestContainers

```java
@Testcontainers
class IntegrationTest {

    @Container
    static PostgreSQLContainer<?> postgres =
        new PostgreSQLContainer<>("postgres:15");

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
    }
}
```
