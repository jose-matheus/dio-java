package org.example;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();

        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
