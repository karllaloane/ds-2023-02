package org.example;

public class Negrito implements Markdown{

    private Markdown texto;

    public Negrito(Markdown texto) {
        this.texto = texto;
    }

    @Override
    public String exibe() {
        return "**" + this.texto.exibe() + "**";
    }
}
