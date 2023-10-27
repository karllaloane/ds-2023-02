package org.example;

public interface Observable {
    void addObserver(InterfaceObserver observer);
    void notificar();
}
