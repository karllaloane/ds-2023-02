package comparator;

import java.util.Arrays;

public class Estudante {
    private String nome;
    private String sobrenome;
    private int idade;
    private double[] notas;

    public Estudante(String nome, String sobrenome, int idade, double[] notas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.notas = notas;
    }

    // Função para calcular a média das notas do estudante
    public double calcularMedia() {
        if (notas.length == 0) {
            return 0.0; // Retorna 0 se não houver notas
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nNotas: " +
                Arrays.toString(notas) + "\nMedia: " +this.calcularMedia();
    }

    public double getMaiorNota() {
        return Arrays.stream(notas).max().orElse(0.0);
    }
}
