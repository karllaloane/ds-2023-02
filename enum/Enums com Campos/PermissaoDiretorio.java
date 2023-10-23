package org.example.modelo1;

public enum PermissaoDiretorio {
    LEITURA("Leitura"),
    ESCRITA("Escrita"),
    EXECUCAO("Execução");

    private final String descricao;

    PermissaoDiretorio(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
