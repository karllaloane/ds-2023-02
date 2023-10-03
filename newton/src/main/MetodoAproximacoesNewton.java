package main;

public class MetodoAproximacoesNewton {

    public static double carcularRaizQuadrada(double num, double epsilon) {
                if (num < 0) {
                    throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
                }
                if (num == 0) {
                    return 0;
                }

                double x0 = num;
                double x1;

                do {
                    x1 = 0.5 * (x0 + num / x0);
                    x0 = x1;
                } while (Math.abs(x1 * x1 - num) > epsilon);

                return x1;

    }

}
