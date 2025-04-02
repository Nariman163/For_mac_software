package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalAreaTriangle() {
        var s = new Triangle(5.0, 4.0, 3.0);
        double result = s.areaTriangle();
        Assertions.assertEquals(6.0, result);
    }
}
