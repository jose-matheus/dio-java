package org.example;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try {
            Conta conta2 = new Conta();
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da conta:");
            int conta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Por favor, insira o saldo:");
            double saldo = scanner.nextDouble();

            conta2.setAgencia(agencia);
            conta2.setNumero(conta);
            conta2.setNomeCliente(nome);
            conta2.setSaldo(saldo);

            System.out.println(conta2);

            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos, saldo e conta precisam ser numericos");
        }
    }
}
