package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        int[] lado = new int[3];

        for (int i = 0; i <= 2; i++) {
            while(true) {
                System.out.println("Digite o lado do triangulo");
                int valor = c.nextInt();
                if (valor > 0) {
                    lado[i] = valor;
                    break;
                } else {
                    System.out.println("Você n digitou um lado valido, tente novamente.");
                }
            }
        }

        Arrays.sort(lado);

        c.close();

        if(lado[0] + lado[1] > lado[2]){
            System.out.println("Você digitou um triangulo valido");
        }else{
            System.out.println("Seu triangulo não é valido");
        }

        if (lado[0] == lado[1] && lado[1] == lado[2]) {
            System.out.println("Este é um triângulo equilátero.");
        } else if (lado[0] == lado[1] || lado[1] == lado[2]) {
            System.out.println("Este é um triângulo isósceles.");
        } else {
            System.out.println("Este é um triângulo escaleno.");
        }

        String sigla = "M";

        switch(sigla){
            case("M"): {
                System.out.println("Medio");
                break;
            }
            case("P"): {
                System.out.println("Pequeno");
                break;
            }
            case("G"): {
                System.out.println("Grande");
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + sigla);
        }


    }
}

