package comparator;

import java.util.Comparator;

// Ordenação pela primeira nota a título de exemplo
public class NotasComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return Double.compare(estudante1.getNotas()[0], estudante2.getNotas()[0]);
    }
}

