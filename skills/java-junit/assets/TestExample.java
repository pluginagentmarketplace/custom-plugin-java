import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Should add two numbers")
    void shouldAddNumbers() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
    }

    @ParameterizedTest
    @CsvSource({"1,1,2", "2,3,5", "10,20,30"})
    void shouldAddParameterized(int a, int b, int expected) {
        assertThat(calculator.add(a, b)).isEqualTo(expected);
    }

    @Test
    void shouldThrowOnDivisionByZero() {
        assertThatThrownBy(() -> calculator.divide(10, 0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessageContaining("zero");
    }
}
