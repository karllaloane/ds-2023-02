package org.example;

public class Italico implements Markdown{

    private Markdown texto;

    public Italico(Markdown texto) {
        this.texto = texto;
    }

    @Override
    public String exibe() {
        return "_" +  this.texto.exibe() + "_";
    }

}
