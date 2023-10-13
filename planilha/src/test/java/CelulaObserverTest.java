import org.example.Celula;
import org.example.CelulaObserver;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CelulaObserverTest {

    @Test
    public void testNotificar() {
        Celula A1 = new Celula("A1");
        Celula A2 = new Celula("A2");
        Celula A3 = new Celula("A3");
        Celula A4 = new Celula("A4");
        Celula A5 = new Celula("A5");
        Celula A6 = new Celula("A6");

        A1.addObserver(new CelulaObserver(A3));
        A2.addObserver(new CelulaObserver(A3));
        A3.addObserver(new CelulaObserver(A4));
        A2.addObserver(new CelulaObserver(A5));
        A4.addObserver(new CelulaObserver(A6));

        // Inicialmente, o valor de A3 deve ser 0
        assertEquals(0, A3.getValor());

        A1.setValor(10); // Alteração em A1

        // O valor de A3 deve ser 11 devido à atualização no método atualizar em A1
        assertEquals(11, A3.getValor());

        A2.setValor(20); // Alteração em A2

        // O valor de A3 deve ser 21 devido à atualização no método atualizar em A2
        assertEquals(21, A3.getValor());
        // O valor de A4 deve ser 21 devido à atualização no método atualizar em A3
        assertEquals(22, A4.getValor());
        // O valor de A6 deve ser 23 devido à atualização no método atualizar em A4
        assertEquals(23, A6.getValor());

        // O valor de A5 deve ser 21 devido à segunda atualização no método atualizar em A2
        assertEquals(21, A5.getValor());

    }

}
