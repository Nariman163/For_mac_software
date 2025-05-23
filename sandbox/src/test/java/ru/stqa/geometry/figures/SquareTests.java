package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalArea(){
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalPerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());

    }

    @Test
    void canEquals(){
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertEquals(s1, s2);
    }

}
