package comparator;

import java.util.Comparator;

public class MediaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        double media1 = estudante1.calcularMedia();
        double media2 = estudante2.calcularMedia();

        return Double.compare(media1, media2);
    }
}

