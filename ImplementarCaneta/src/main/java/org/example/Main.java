package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caneta caneta = new Caneta();

        System.out.println("Qual a marca da caneta? ");
        caneta.setMarca(scanner.next());

        System.out.println("Qual a cor da caneta?");
        caneta.setCor(scanner.next());

        scanner.nextLine();

        System.out.println("Qual o tamanho da caneta");
        caneta.setTamanho(scanner.nextInt());

        System.out.println(caneta.toString());
    }
}