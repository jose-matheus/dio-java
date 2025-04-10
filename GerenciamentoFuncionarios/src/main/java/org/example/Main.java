package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new FuncionarioComum("João", "111.222.333-44", 2500);
        Funcionario f2 = new Gerente("Maria", "222.333.444-55", 4000, 1500);

        System.out.println(f1.getSalarioTotal()); // 2500.0
        System.out.println(f2.getSalarioTotal()); // 5500.0

    }
}