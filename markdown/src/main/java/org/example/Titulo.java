package org.example;

public class Titulo implements Markdown {

    private String texto;

    public Titulo(String texto) {
        this.texto = texto;
    }

    @Override
    public String exibe() {
        return "# " + this.texto;
    }
}
