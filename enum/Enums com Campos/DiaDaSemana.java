package org.example.modelo1;

public enum DiaDaSemana {

    DOMINGO ("Domingo"),
    SEGUNDA ("Segunda-feira"),
    TERCA ("Terça-feira"),
    QUARTA ("Quarta-feira"),
    QUINTA ("Quinta-feira"),
    SEXTA ("Sexta-feita"),
    SABADO ("Sábado");

    private final String descricao;

    DiaDaSemana(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}