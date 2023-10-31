package org.example;

public class Multiplica implements Expressao{

    private Expressao constante1;
    private Expressao constante2;

    public Multiplica(Expressao constante1, Expressao constante2) {
        this.constante1 = constante1;
        this.constante2 = constante2;
    }

    @Override
    public float valor() {

        float produto = 0;

        produto = this.constante1.valor() * this.constante2.valor();

        return produto;
    }
}
