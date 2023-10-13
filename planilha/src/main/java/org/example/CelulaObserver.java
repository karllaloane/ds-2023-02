package org.example;

public class CelulaObserver implements Observer{

    private Celula celula;

    public CelulaObserver(Celula celula){
        this.celula = celula;
    }

    @Override
    public void atualizar(Celula celulaObservada) {
        System.out.println("Reavaliar " + celula.getNome() + " por mudança ocorrida em " + celulaObservada.getNome());
        celula.setValor(celulaObservada.getValor() + 1); //passando o valor da celula observada + 1 apenas para fins de testes
    }
}

