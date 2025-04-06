package org.example;

public class Main {
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada("Branco", true, 20, "Vermelho", "philco", 25.0, 40, false);
        Lampada lamp2 = new Lampada("Branco", true, 20, "Vermelho", "philco", 44.0, 50, false);

        System.out.println(lamp1);

        if(lamp1.getPotencia() > lamp2.getPotencia()){
            System.out.println("A lampada com maior potência é: " + lamp1.toString());
        }else{
            System.out.println("A lampada com maior potência é: " + lamp2.toString());
        }
        // preço
        if(lamp1.getPreco() > lamp2.getPreco()){
            System.out.println("A lampada com maior preço é: " + lamp1.toString());
        }else{
            System.out.println("A lampada com maior preço é: " + lamp2.toString());
        }
    }
}