package org.example.modelo1;

public enum PontoCardeal {
    NORTE("Norte"),
    SUL("Sul"),
    LESTE("Leste"),
    OESTE("Oeste");

    private final String descricao;

    PontoCardeal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

