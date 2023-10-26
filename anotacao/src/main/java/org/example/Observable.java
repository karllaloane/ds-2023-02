package org.example;

public interface Observable {
    void addObserver(Object observer);
    void notificar();
}
