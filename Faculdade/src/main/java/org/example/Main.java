package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RegistroAcademico registroAcademico = new RegistroAcademico();

        System.out.println("Digite o nome do aluno?");
        String nome = scanner.nextLine();

        System.out.println("Digite a matricula do aluno?");
        int matricula = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a data de nascimento do aluno");
        String data = scanner.next();

        System.out.println("É Bolsista?");
        boolean bolsa = scanner.nextBoolean();

        System.out.println("Digite o ano de matricula do aluno:");
        int ano = scanner.nextInt();

        System.out.println("Digite a mensalidade do aluno:");
        double mensalidade = scanner.nextDouble();

        registroAcademico.inicializaRegistro(nome, matricula, data, bolsa, ano);

        registroAcademico.calculaMensalidade(mensalidade);

        System.out.println(registroAcademico.toString());



    }
}