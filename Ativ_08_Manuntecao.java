package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_08_Manuntecao {
    public static void main(String[] args) {
        Random gerador = new Random();
        double soma = 0;
        double tempoOperacao;


        for (int maquina = 1; maquina <= 20; maquina++) {
            tempoOperacao = 100 + gerador.nextDouble() * 500;
            System.out.printf("Tempo de operação da máquina %d: %.2f horas%n", maquina, tempoOperacao);
            soma += tempoOperacao;
        }

        System.out.printf("Tempo total de operação das máquinas durante o ano: %.2f horas%n", soma);
    }
}

