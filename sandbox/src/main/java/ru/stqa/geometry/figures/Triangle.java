package ru.stqa.geometry.figures;
import java.lang.Math;
//формула герона  p(p-a)(p-b)(p-c) в степени 1/2, p - полупериметр

public class Triangle {

    double T1;
    double T2;
    double T3;

    public Triangle(double T1, double T2, double T3) {
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
    }

    public double areaTriangle() {
        double p = (T1 + T2 + T3) / 2.0;
        return Math.sqrt(p * (p - T1) * (p - T2) * (p - T3));
    }

}

