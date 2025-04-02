package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, insira o saldo:");
        double saldo = scanner.nextDouble();

        Conta conta1 = new Conta(saldo, nome, agencia, conta);

        System.out.println(conta1);

        scanner.close();
    }
}
