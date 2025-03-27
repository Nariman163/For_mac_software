package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println("The area of a square with side " + side + " is " + squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
