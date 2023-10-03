package test;

import main.MetodoAproximacoesNewton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MetodoAproximacoesNewtonTest {

    @Test
    public void squareRootTest() {

        //terceiro parametro definido no teste para tolerancia (ou precisao) permitida para a diferenca entre o valor
        //calculado da raiz quadrada e o valor esperado.

        // Teste com numeros positivos
        assertEquals(2.0, MetodoAproximacoesNewton.carcularRaizQuadrada(4.0, 0.0001), 0.0001);
        assertEquals(3.0, MetodoAproximacoesNewton.carcularRaizQuadrada(9.0, 0.0001), 0.0001);
        assertEquals(5.0, MetodoAproximacoesNewton.carcularRaizQuadrada(25.0, 0.0001), 0.0001);
        assertEquals(10.0, MetodoAproximacoesNewton.carcularRaizQuadrada(100.0, 0.0001), 0.0001);

        // Teste com numeros próximos a zero
        assertEquals(0.0, MetodoAproximacoesNewton.carcularRaizQuadrada(0.0, 0.0001), 0.0001);

        // Teste com numeros grandes
        assertEquals(100.0, MetodoAproximacoesNewton.carcularRaizQuadrada(10000.0, 0.0001), 0.0001);

        // Teste com epsilon menor para maior precisão
        assertEquals(3.16227766, MetodoAproximacoesNewton.carcularRaizQuadrada(10.0, 0.00000001), 0.00000001);
    }

    @Test
    public void negativeNumberTest() {
        // Teste com número negativo
        assertThrows(IllegalArgumentException.class, () -> MetodoAproximacoesNewton.carcularRaizQuadrada(-4.0, 0.0001));
    }
}
