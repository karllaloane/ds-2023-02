package org.example;

public class Main {
    public static void main(String[] args) {

        ConcreteObservable concreteObservable = new ConcreteObservable("carro");

        @Observer(observado = "carro")
        class CarroObserver implements InterfaceObserver{
            @Override
            public void atualizar() {
                System.out.println("Identificador carro");
            }
        }

        try{
            concreteObservable.addObserver(new CarroObserver());
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        concreteObservable.addObserverSemIdentificador(
                () -> {
                    System.out.println("Atualizar sem identificador");
                }
        );


        // LAMBDA
        teste(() -> {
            System.out.println("Atualizar lambda");
        });

    }

    static void teste(InterfaceObserver i){
        i.atualizar();
    }
}