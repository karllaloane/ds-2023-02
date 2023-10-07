package test;

import org.example.NewtonCalculations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class NewtonCalculationsTest {

    @Test
    public void testRaizQuadrada() {
        NewtonCalculations calculadora = new NewtonCalculations();

        // Teste com numeros positivos
        assertEquals(2.0, calculadora.apply(4.0), 0.0001);
        assertEquals(3.0, calculadora.apply(9.0), 0.0001);
        assertEquals(5.0, calculadora.apply(25.0), 0.0001);
        assertEquals(10.0, calculadora.apply(100.0), 0.0001);
        assertEquals(12.0, calculadora.apply(144.0), 0.0001);

        // Teste com numeros próximos a zero
        assertEquals(0.0, calculadora.apply(0.0), 0.0001);

        // Teste com numeros grandes
        assertEquals(100.0, calculadora.apply(10000.0), 0.0001);
        assertEquals(144.0, calculadora.apply(20736.0), 0.0001);

        // Teste com epsilon menor para maior precisão
        assertEquals(3.16227766, calculadora.apply(10.0), 0.00000001);
        assertEquals(4.553679, calculadora.apply(20.7360), 0.0001);
    }

    @Test
    public void negativeNumberTest() {

        NewtonCalculations calculadora = new NewtonCalculations();

        // Teste com número negativo
        assertThrows(IllegalArgumentException.class, () -> calculadora.apply(-4.0));
    }
}