package org.example;

public record Square(double side) implements GeomatricForm{
    @Override
    public double getArea() {
        return side * side;
    }
}
