package org.example.modelo2;


public class Main {
        public static void main(String [] args){

            DiaDaSemana dia = DiaDaSemana.SABADO;
            System.out.println("Dia da semana: " + dia.toString() + "." );

            PermissaoDiretorio permissaoDiretorio = PermissaoDiretorio.LEITURA;
            System.out.println("Permissao: " + permissaoDiretorio.toString() + "." );

            TamanhoPizza tamanhoPizza = TamanhoPizza.PEQUENA;
            System.out.println("Tamanho da Pizza: " + tamanhoPizza.toString() + ".");

            PontoCardeal ponto = PontoCardeal.LESTE;
            System.out.println("Ponto cardeal: " + ponto.toString() + ".");

            PosicaoXadrez posicao = PosicaoXadrez.H1;
            System.out.println("Posição no tabuleiro: " + posicao.toString() + ".");

    }
}
