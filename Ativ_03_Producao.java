package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_03_Producao {
    public static void main(String[] args) {
        Random gerador= new Random();
        double soma= 0;
        double media;

        for (int dia=1; dia<=30;dia++){
            double producao= 400+gerador.nextDouble()*200;
            System.out.printf("A produção do dia: %2f%n", producao);
            soma+=producao;
        }
        media= soma/30;
        System.out.printf("Produção total do més: %2f%n",soma);
        System.out.printf("Média díaria de produção:%2f%n", media);
    }
}
