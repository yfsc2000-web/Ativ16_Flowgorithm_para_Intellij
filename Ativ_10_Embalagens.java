package Atividade_16_Flowgorithm;

import java.util.Random;

public class Ativ_10_Embalagens {
    public static void main(String[] args) {
        Random gerador = new Random();
        int totalEmbalagens = 100;
        int aprovadas = 0;

        for (int i = 1; i <= totalEmbalagens; i++) {
            int resultado = 70 + gerador.nextInt(31);
            System.out.printf("Embalagem %d - Resultado do teste: %d%%%n", i, resultado);

            if (resultado >= 85) {
                aprovadas++;
            }
        }
        double porcentagem = (aprovadas * 100.0) / totalEmbalagens;
        System.out.printf("Total de embalagens aprovadas: %.2f%%%n", porcentagem);
    }
}

