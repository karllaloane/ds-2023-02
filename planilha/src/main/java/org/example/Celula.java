package org.example;

import java.util.ArrayList;
import java.util.List;

public class Celula implements Observable{

    private String nome;
    private int valor;
    private List<Observer> observadores = new ArrayList<>();

    public Celula(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int novoValor) {
        valor = novoValor;
        this.notificar();
    }

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer observador : observadores) {
            observador.atualizar(this);
        }
    }
}
