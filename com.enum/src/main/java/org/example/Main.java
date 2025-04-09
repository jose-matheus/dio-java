package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        for(EstadosBrasileiros e : EstadosBrasileiros.values()){
            System.out.println(e.getSigla() + "-" + e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.PIAUI;

        System.out.println(eb.getNomeToUpperCase());

        Date datanascimento = new Date("01/12/2023");

        Pessoa pessoa = new Pessoa("Matheus", 21, datanascimento, eb);

        System.out.println(pessoa.toString());
    }
}