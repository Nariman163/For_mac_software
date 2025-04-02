import ru.stqa.geometry.figures.Triangle;

import java.io.File;

public class Learn1_8 {
            public static void main(String[] args) {
                Triangle triangle = new Triangle(3, 4, 5);
                System.out.println("Площадь треугольника: " + triangle.areaTriangle());
            }

}