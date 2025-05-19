package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalAreaTriangle() {
        var s = new Triangle(5.0, 4.0, 3.0);
        double result = s.calculateArea();
        Assertions.assertEquals(6.0, result);
    }

    @Test
    void triangleExistSideA() {
        try {
            new Triangle(-3.0, 5.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    void triangleExistSideB() {
        try {
            new Triangle(3.0, -5.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    void triangleExistSideC() {
        try {
            new Triangle(3.0, 5.0, -6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    void testEquality(){
        var f1 = new Triangle(3.0,4.0,5.0);
        var f2 = new Triangle(5.0,4.0,3.0);
        Assertions.assertEquals(f1,f2);
    }
    @Test
    void testEquality2(){
        var g1 = new Triangle(3.0,4.0,5.0);
        var g2 = new Triangle(4.0,5.0,3.0);
        Assertions.assertEquals(g1,g2);
    }
}