package Hommework.lesson8;

public class ShapeUtils {
    public static void figureIsRectangle(double a, double b, double c, double d) {
        if (a == c && b == d || a == d && b == c || a == b && c == d) {
            double sideA = Math.min(Math.min(a, b), Math.min(c, d));
            double sideB = Math.max(Math.max(a, b), Math.max(c, d));
            double diagonal = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
            diagonal = Math.pow(diagonal, 2);
            diagonal = Math.ceil(diagonal);

            if (diagonal == (Math.pow(sideA, 2) + (Math.pow(sideB, 2)))) {
                System.out.println("the figure is a rectangle");
            } else {
                System.out.println("figure is not a rectangle");
            }
        } else {
            System.out.println("figure is not a rectangle");
        }
    }

    public static void figureIsTriangles(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("figure is triangles");
        } else {
            System.out.println("the figure is not a triangle");
        }
    }
}
