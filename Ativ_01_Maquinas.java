package Atividade_16_Flowgorithm;

import java.util.Random;
import java.util.Scanner;

public class Ativ_01_Maquinas {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random gerador= new Random();
        int contador=0;
        double soma=0;
        double media;
        for (int maquina = 1; maquina<=100;maquina++){
            double numero= gerador.nextDouble()*100;
            System.out.printf("A eficiência da máquina será; %.2f%n", numero);
            soma+=numero;
        }
        media=soma/100;
        System.out.printf("A média da eficiêñcia será: %.2f%n", media);
    }
}
