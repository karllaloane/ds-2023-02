import comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudante> listaEstudantes = new ArrayList<>();

        preencherListaEstudantes(listaEstudantes);


        // Ordenar a lista de estudantes pelos critérios
        listaEstudantes.sort(new NomeComparator());
        imprimir(listaEstudantes, "nome");

        Collections.sort(listaEstudantes, Collections.reverseOrder(new NomeComparator()));
        imprimir(listaEstudantes, "nome por ordem inversa");

        listaEstudantes.sort(new SobrenomeComparator());
        imprimir(listaEstudantes, "sobrenome");

        listaEstudantes.sort(new IdadeComparator());
        imprimir(listaEstudantes, "idade");

        listaEstudantes.sort(new NotasComparator());
        imprimir(listaEstudantes, "notas");

        listaEstudantes.sort(new MediaComparator());
        imprimir(listaEstudantes, "media");

    }

    // Função para preencher a lista de estudantes com dados de exemplo
    public static void preencherListaEstudantes(List<Estudante> lista) {
        lista.add(new Estudante("Carol", "Oliveira", 19, new double[]{92, 78, 85}));
        lista.add(new Estudante("Bob", "Santos", 22, new double[]{88, 76, 94}));
        lista.add(new Estudante("David", "Pereira", 21, new double[]{85, 90, 88}));
        lista.add(new Estudante("Alice", "Silva", 20, new double[]{90, 85, 92}));
    }

    // Função para imprimir a lista de estudantes
    public static void imprimir(List<Estudante> listaEstudantes, String criterio){

        System.out.println("========================= Ordenação por " + criterio + " ===========================");
        for(Estudante e: listaEstudantes){
            System.out.println(e.toString() + "\n");
        }

    }

}
