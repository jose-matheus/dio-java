package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        double temp = sc.nextDouble();

        double f = CelsiusFahrenheit(temp);
        double k = CelsiusKelvin(temp);

        System.out.printf("Sua temperatura em Fahrenheit é: %.2f \n", f);

        System.out.printf("Sua temperatura em Kelvin é: %.2f", k);

    }

    public static double CelsiusFahrenheit(double temp){
        return temp * 1.8 + 32.0;
    }

    public static double CelsiusKelvin(double temp){
        return temp + 273.15;
    }

}