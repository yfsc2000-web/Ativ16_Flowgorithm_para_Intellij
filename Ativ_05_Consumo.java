package Atividade_16_Flowgorithm;

import java.util.Random;
import java.util.Scanner;

public class Ativ_05_Consumo {
    public static void main(String[] args) {
        Random gerador = new Random();
        double consumoTotal = 0;

        for (int maquina = 1; maquina <= 10; maquina++) {
            double consumoHora = gerador.nextDouble() * 10;
            double consumo24h = consumoHora * 24;
            consumoTotal += consumo24h;

            System.out.printf("Máquina consumiu: %.2f%n", consumo24h);
        }

        System.out.printf("Consumo total das 10 máquinas em 24h: %.2f%n", consumoTotal);
    }
}
