package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        long resultado = 1;
        ArrayList<Integer> fator = new ArrayList<Integer>();

        System.out.println("Digite o número que deseja saber o fatorial!");
        int fatorial = num.nextInt();

        for(int i = fatorial; i  >= 1; i--){
            resultado *= i;
            fator.add(i);
        }

        System.out.println("O fatorial do número é : ".concat(fator.toString()).concat(" = ") + resultado);

        num.close();
    }
}