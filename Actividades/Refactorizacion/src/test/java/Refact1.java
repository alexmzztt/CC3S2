import org.example.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Refact1 {
    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        calculadora = new Calculadora();
    }

    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        Calculadora calculadora = new Calculadora();

        assertEquals( 5, calculadora.addition(3,2));
    }

    @Test
    public void whenRestTwoNumberThenReturnCorrectAnswer() {
        Calculadora calculadora = new Calculadora();

        assertEquals( 2, calculadora.rest(7,5));
    }

    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        assertEquals(2, calculadora.division(8, 4));
    }

    @Test
    public void whenDivisionByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(5, 0);
        });
        assertEquals("No se puede divisor por  cero", exception.getMessage());
    }

    @Test
    public void whenMultiplicationThenReturnCorrectAnswer() {
        assertEquals(6, calculadora.multiplicacion(3, 2));
    }
}