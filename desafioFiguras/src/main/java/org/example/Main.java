package org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option = -1;
        GeomatricForm geomatricForm = null;
        while(true){
            System.out.println("Escolha a forma geometrica para calcular a área \n 1 - Quadrado \n 2 - Retângulo \n 3 - Circulo \n 4 - Sair do programa");
            option = scanner.nextInt();
            if(option == 1) geomatricForm = createSquare();
            else if(option == 2) geomatricForm = createRetangle();
            else if (option == 3) geomatricForm = createCircle();
            else if (option == 4) break;
            else{
                System.out.println("Opção invalida");
                continue;
            }
            System.out.println("O resultado do cálculo da área foi de " + geomatricForm.getArea());
        }
    }
    private static GeomatricForm createSquare(){
        System.out.println("Informe o tamanho dos lados:");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeomatricForm createRetangle(){
        System.out.println("Informe a base:");
        double base = scanner.nextDouble();
        System.out.println("Informe a altura:");
        double heigth = scanner.nextDouble();
        return new Retangle(heigth, base);
    }

    private static GeomatricForm createCircle(){
        System.out.println("Informe o raio:");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}