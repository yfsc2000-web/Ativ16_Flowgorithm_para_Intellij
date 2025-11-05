package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_02_Forno {
    static void main() {
        Random gerador= new Random();
        double soma= 0;
        double media;

        for (int minuto=1;minuto<=720;minuto++){
            double temperatura= 350+ gerador.nextDouble()*50;
            System.out.printf("Temperatura no minuto:%.2f%n", temperatura);
            soma+=temperatura;
        }
        media= soma/720;
        System.out.printf("A temperatura media foi: %.2f%n", media);
    }
}
