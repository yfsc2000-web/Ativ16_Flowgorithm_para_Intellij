package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_09_Demanda {
    public static void main(String[] args) {
        Random gerador = new Random();
        double soma = 0;
        double media;

        for (int produto = 1; produto <= 10; produto++) {
            double previsao = 100 + gerador.nextDouble() * 400;
            System.out.printf("Previsão de vendas do produto %d: %.2f unidades%n", produto, previsao);
            soma += previsao;
        }

        media = soma / 10;
        System.out.printf("Previsão média de vendas dos produtos: %.2f unidades%n", media);
    }
}
