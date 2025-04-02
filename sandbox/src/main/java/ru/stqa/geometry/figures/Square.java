package ru.stqa.geometry.figures;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return this.side*this.side;
    }

    public double perimeter() {
        return this.side * 4;
    }
}
