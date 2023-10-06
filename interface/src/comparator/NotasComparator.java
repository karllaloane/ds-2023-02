package comparator;

import java.util.Comparator;

// Compara a maior nota de cada estudante
public class NotasComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return Double.compare(estudante1.getMaiorNota(), estudante2.getMaiorNota());
    }
}

