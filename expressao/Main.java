package org.example;

public class Main {
    public static void main(String[] args) {

        Expressao soma = new Soma(new Constante(5),new Multiplica(new Constante(2), new Constante(3)));

        System.out.println("Resultado: " + soma.valor());

        Expressao divide = new Divide(new Constante(10),new Soma(new Constante(2), new Constante(3)));

        System.out.println("Resultado: " + divide.valor());

    }
}