package org.example;

public class Main {
    public static void main(String[] args) {
        Markdown texto = new Texto("Uma simples linha");
        System.out.println(texto.exibe());

        Markdown negrito = new Negrito(texto);
        System.out.println(negrito.exibe());

        Markdown item = new Item(new Texto("esse é um item"));
        System.out.println(item.exibe());

        Markdown concatena = new Concatena(texto, new Negrito(new Texto("com negrito")));
        System.out.println(concatena.exibe());

        Markdown concatena2 = new Concatena(concatena, new Texto("e"));
        System.out.println(concatena2.exibe());

        Markdown italico = new Italico(new Texto("italico"));

        Markdown concatena3 = new Concatena(concatena2, italico);
        System.out.println(concatena3.exibe());

        Markdown concatena4 = new Concatena(new Concatena(item, new Texto("com")), italico);
        System.out.println(concatena4.exibe());
    }
}