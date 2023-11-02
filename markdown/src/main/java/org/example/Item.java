package org.example;

public class Item implements Markdown {

    private Markdown texto;

    public Item(Markdown texto) {
        this.texto = texto;
    }

    @Override
    public String exibe() {
        return "○    " + this.texto.exibe();
    }
}