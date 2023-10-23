package org.example.modelo1;

public enum TamanhoPizza {
    PEQUENA("Pequena", 8),
    MEDIA("Média", 10),
    GRANDE("Grande", 12);

    private final String descricao;
    private final int fatias;

    TamanhoPizza(String descricao, int fatias) {
        this.descricao = descricao;
        this.fatias = fatias;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getFatias() {
        return fatias;
    }
}

