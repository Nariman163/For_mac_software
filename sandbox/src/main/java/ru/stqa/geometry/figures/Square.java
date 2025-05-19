package ru.stqa.geometry.figures;


import java.util.Objects;

public class Square {
        public static void main(String[] args) {

            Square square = new Square(5.0);

            System.out.println("Площадь квадрата: " + square.area());
        }
        public double side;

        public Square(double side) {
            this.side = side;
        }

        public double area() {
            return this.side * this.side;
        }

        public double perimeter() {
            return this.side * 4;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(side);
    }
}