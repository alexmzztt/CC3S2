import org.example.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    /*@Test
    public void whenCalculatorInitializedThenReturnTrue() {
        Calculadora calculadora = new Calculadora();

        assertTrue(calculadora.getStatus());
    }*/

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
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    public void whenMultiplicationThenReturnCorrectAnswer() {
        assertEquals(6, calculadora.multiplicacion(3, 2));
    }

    @Test
    public void whenPotenciaThenReturnCorrectAnswer() {
        assertEquals(9, calculadora.potencia(3, 2));
    }

    @Test
    public void whenRaizThenReturnCorrectAnswer() {
        assertEquals(2, calculadora.raiz(4, 2));
    }

    @Test
    public void whenRaizByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.raiz(5, 0);
        });
        assertEquals("No se puede sacar raiz de un índice menor o igual a 0", exception.getMessage());
    }
}
