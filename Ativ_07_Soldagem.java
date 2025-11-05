package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_07_Soldagem {
    public static void main(String[] args) {
        Random gerador = new Random();
        double soma = 0;
        double media;
        double limite = 35;
        boolean excedeuLimite = false;

        for (int soldagem = 1; soldagem <= 20; soldagem++) {
            double tempo = 20 + gerador.nextDouble() * 25;
            System.out.printf("Tempo da soldagem %d: %.2f minutos%n", soldagem, tempo);
            soma += tempo;

            if (tempo > limite) {
                excedeuLimite = true;
            }
        }
        media = soma / 20;
        System.out.printf("%nTempo médio das soldagens: %.2f minutos%n", media);

        if (excedeuLimite) {
            System.out.println("Alguma soldagem excedeu o limite de " + limite + " minutos!");
        } else {
            System.out.println("Nenhuma soldagem excedeu o limite de tempo.");
        }
    }
}
