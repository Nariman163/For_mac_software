public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);
    }

    public static void printSquareArea(double a) {
        System.out.println("The area of a square with side " + a + " is " + (a * a));
    }
}
