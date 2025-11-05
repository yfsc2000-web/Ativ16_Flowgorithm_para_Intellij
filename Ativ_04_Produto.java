package Atividade_16_Flowgorithm;

import java.util.Random;
import java.util.Scanner;

public class Ativ_04_Produto {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();
        double totalpecas=200;
        double defeitos=0;

        for (int numero = 1; numero <= 200; numero++) {
            System.out.println("A peça é defeituosa? (sim/não)");
            String defeituosa = sc.nextLine();

            if (defeituosa.equalsIgnoreCase("sim")) {
                defeitos++;
            } else {
                System.out.println("Peça ideal");
            }
        }

        double resultado = (defeitos * 100) / totalpecas;
        System.out.printf("A porcentagem de defeitos do lote é: %.2f%n", resultado);

    }
}