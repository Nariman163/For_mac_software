package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalPerimetrTriangle(){
        double result = Triangle.perimetrArea(5.0,5.0,2.0);
        Assertions.assertEquals(12.0, result);
    }
}
