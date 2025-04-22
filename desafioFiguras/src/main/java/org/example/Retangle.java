package org.example;

public record Retangle(double height, double base) implements GeomatricForm {
    @Override
    public double getArea() {
        return height * base;
    }
}
