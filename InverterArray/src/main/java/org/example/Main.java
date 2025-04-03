package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[5];
        int copia[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu vetor de cinco números inteiros! ");
        for(int i = 0; i <= 4; i++){
            System.out.println("Digite um número para adicionar ao vetor! ");
            array [i] = scanner.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            copia[i] = array[4 - i];
            System.out.println(copia[i]);
        }
        scanner.close();
    }
}