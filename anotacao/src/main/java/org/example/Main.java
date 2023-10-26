package org.example;

public class Main {
    public static void main(String[] args) {

        //USANDO CLASSES ANÔNIMAS

        ConcreteObservable concreteObservable = new ConcreteObservable("carro");

        @Observer(observado = "carro")
        class CarroObserver {}

        CarroObserver carroObserver = new CarroObserver();

        try{
            concreteObservable.addObserver(carroObserver);
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        @Observer(observado = "barco")
        class BarcoObserver {}

        BarcoObserver barcoObserver = new BarcoObserver();

        try{
            concreteObservable.addObserver(barcoObserver);
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}