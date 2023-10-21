package org.example;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] userInputParts = getComando();

        if (userInputParts == null) return;

        String nomeClasse = userInputParts[1];
        String caminhoDiretorio = userInputParts[2];
        boolean flagParallelStream = userInputParts.length > 3 && userInputParts[3].equals("-p");

        List<String> locaisEncontrados = BuscarClasse.procurarClasse(nomeClasse, caminhoDiretorio, flagParallelStream);

        exibirResultados(nomeClasse, locaisEncontrados);
    }

    private static void exibirResultados(String nomeClasse, List<String> locaisEncontrados) {

        if(locaisEncontrados.isEmpty())
            System.out.println("Não foram encontradas classes contendo o nome: " + nomeClasse);

        for (String locais : locaisEncontrados) {
            System.out.println("Classe encontrada em: " + locais);
        }
    }

    private static String[] getComando() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Use: fc <nome da classe> <dir> [-p]");

        String userInput = scanner.nextLine();

        String[] userInputParts = userInput.split(" ");

        if (userInputParts.length < 3) {
            System.out.println("Entrada inválida. Use: fc <nome da classe> <dir> [-p]");
            return null;
        }
        return userInputParts;
    }

}