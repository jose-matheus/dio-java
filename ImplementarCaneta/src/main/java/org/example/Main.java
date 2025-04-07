package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Caneta> canetas = new ArrayList<>();

        while (true) {
            System.out.println("Escolha a operação desejada: " + '\n' +
                    "01. Cadastrar Caneta" + '\n' +
                    "02. Exibir todas as Canetas" + '\n' +
                    "03. Exibir a quantidade de Canetas cadastradas" + '\n' +
                    "04. Consultar quantidades de Canetas de uma determinada cor" + '\n' +
                    "05. Sair");
            int caso = scanner.nextInt();

            switch (caso) {
                case (1): {
                    while(true) {
                        Caneta caneta = new Caneta();
                        System.out.println("Digite o tamanho da caneta");
                        caneta.setTamanho(scanner.nextInt());

                        System.out.println("Digite a cor da caneta");
                        caneta.setCor(scanner.next());

                        System.out.println("Digite a marca da caneta");
                        caneta.setMarca(scanner.next());

                        canetas.add(caneta);

                        System.out.println("Sua caneta foi criada com sucesso!".concat(caneta.toString()));

                        System.out.println("Deseja criar uma nova Caneta?");
                        String condition = scanner.next();

                        if (condition.equalsIgnoreCase("nao")) {
                            break;
                        }
                    }
                    break;
                }
                case (2): {
                    System.out.println("Suas canetas são: " + canetas);
                    break;
                }
                case (3): {
                    System.out.println("A quantidade total de canetas cadastradas é: " + canetas.size());
                    break;
                }
                case (4): {

                    System.out.println("Digite um cor para consultar as canetas: ");
                    String cor = scanner.next();
                    int contador = 0;

                    for(Caneta c : canetas){
                        if(c.getCor().equalsIgnoreCase(cor)) {
                            contador ++;
                        }
                    }
                    System.out.println("Quantidade de canetas da cor ".concat(cor) + ": " + contador);
                    break;
                }
                case (5): {
                    System.out.println("Programa encerrado. Até mais!");
                    return;
                }
                default: {
                    System.out.println("Opção digitada invalida!");
                    break;
                }
            }
        }
    }
}