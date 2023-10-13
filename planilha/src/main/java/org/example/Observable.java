package org.example;

public interface Observable {
    void addObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificar();

}
