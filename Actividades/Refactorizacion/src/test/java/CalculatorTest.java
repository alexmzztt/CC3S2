import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public void whenCalculatorInitializedThenReturnTrue() {
        Calculadora calculadora = new Calculadora();

        assertTrue(calculadora.getStatus());
    }

    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        Calculadora calculadora = new Calculadora();

        assertEquals( 5, calculadora.addition(3,2));
    }



}
