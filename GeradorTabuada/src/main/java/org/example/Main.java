package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);

        System.out.println("Qual número deseja saber a tabuada?");
        int num = tabuada.nextInt();

        System.out.println("Tabuada do número: " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
        tabuada.close();
    }
}