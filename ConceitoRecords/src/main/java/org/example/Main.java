package org.example;

public class Main {
    public static void main(String[] args) {
        var person = new Person("", 23);

        System.out.println(person);
        System.out.println(person.name());
    }
}