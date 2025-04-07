package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        try {
    
            contar(num1, num2);

        }catch(ParametrosInvalidosException e){
            System.err.println("O segundo parametro deve ser maior que o primeiro");
        }
    }
    public static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if(param1 > param2){
            throw new ParametrosInvalidosException();
        }
        int contagem = param2 - param1;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número :" + i);
        }
    }
}