package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle; //Указывает откуда берем данный класс
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.0);
        Square.printSquareArea(5.0);
        Square.printSquareArea(3.0);

        Rectangle.printRectangleArea(3.0,5.0);
        Rectangle.printRectangleArea(7.0,9.0);

        Triangle.printPerimetr(5.0,7.0,8.0);

    }


}


