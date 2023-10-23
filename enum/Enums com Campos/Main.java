package org.example.modelo1;

public class Main {
    public static void main(String [] args){

        DiaDaSemana dia = DiaDaSemana.SEGUNDA;
        System.out.println("Dia da semana: " + dia.getDescricao() + "." );

        PermissaoDiretorio permissaoDiretorio = PermissaoDiretorio.ESCRITA;
        System.out.println("Permissao: " + permissaoDiretorio.getDescricao() + "." );

        TamanhoPizza tamanhoPizza = TamanhoPizza.GRANDE;
        System.out.println("Tamanho da Pizza: " + tamanhoPizza.getDescricao() + "," +
                " fatias: " + tamanhoPizza.getFatias() + "." );

        PontoCardeal ponto = PontoCardeal.NORTE;
        System.out.println("Ponto cardeal: " + ponto.getDescricao() + ".");

        PosicaoXadrez posicao = PosicaoXadrez.C3;
        System.out.println("Posição no tabuleiro: " + posicao.getDescricao() + ".");

    }
}
