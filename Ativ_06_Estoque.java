package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_06_Estoque {
    public static void main(String[] args) {
        Random gerador = new Random();
        double soma = 0;
        double media;

        for (int material = 1; material <= 50; material++) {
            double consumo = gerador.nextDouble() * 500;
            System.out.printf("Consumo do material %d: %.2f unidades%n", material, consumo);
            soma += consumo;
        }

        media = soma / 50;
        System.out.printf("%nEstoque médio dos materiais: %.2f unidades%n", media);
    }
}

