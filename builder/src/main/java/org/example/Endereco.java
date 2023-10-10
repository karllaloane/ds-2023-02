package org.example;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Endereco {
    private String rua;
    private String setor;
    private String cep;
    private int numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;

}
