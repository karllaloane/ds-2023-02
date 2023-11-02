package org.example;

public class Texto implements Markdown {

    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    @Override
    public String exibe() {
        return this.texto;
    }
}
