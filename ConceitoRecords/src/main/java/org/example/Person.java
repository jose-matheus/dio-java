package org.example;

public record Person(String name, int age) {

    public Person {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
    }
}
