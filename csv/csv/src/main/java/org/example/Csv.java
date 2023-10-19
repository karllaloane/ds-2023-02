package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Csv {

    public static void main(String[] args) {

        System.out.println("Leitor de CSV");

        String inputFileName = "input.csv";
        String outputFileName = "output.csv";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))
        ) {
            String linha;

            while ((linha = reader.readLine()) != null) {

                String[] columns = linha.split(",");


                if (columns.length >= 2) {
                    // Parse as duas primeiras colunas para números
                    double num1 = Double.parseDouble(columns[0]);
                    double num2 = Double.parseDouble(columns[1]);

                    double suma = num1 + num2;

                    System.out.println("" + num1 + " " + num2 + " = " + suma);

                    writer.println(linha + "," + suma);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
