package org.example;

public class Concatena implements Markdown {
    private Markdown markdown1;
    private Markdown markdown2;

    public Concatena(Markdown markdown1, Markdown markdown2) {
        this.markdown1 = markdown1;
        this.markdown2 = markdown2;
    }

    public String exibe() {
        return markdown1.exibe() + " " + markdown2.exibe();
    }
}