package Hommework.lesson9;

public class MainJava {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5.0, 8.0, 8.0);
        Triangle triangle2 = new Triangle(5.0, 8.0, 8.0);

        System.out.println(triangle1.square());
        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1);

        IsoscelesTriangle isoscelesTriangle1 = new IsoscelesTriangle(6.0, 3.0, 6.0);

        System.out.println(isoscelesTriangle1.height());
        System.out.println(isoscelesTriangle1.square());

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5.0, 5.0, 5.0);

        System.out.println(equilateralTriangle.square());
        System.out.println(equilateralTriangle.height());

        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);

        System.out.println(circle1.square());
        System.out.println(circle1.perimeter());
        System.out.println(circle1.diameter());
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1);

        Quadrilateral quadrilateral1 = new Quadrilateral(5.0, 5.0, 5.0, 5.0);
        Quadrilateral quadrilateral2 = new Quadrilateral(5.0, 5.0, 5.0, 5.0);

        System.out.println(quadrilateral1.width());
        System.out.println(quadrilateral1.length());
        System.out.println(quadrilateral1.square());
        System.out.println(quadrilateral1.perimeter());
        System.out.println(quadrilateral1.equals(quadrilateral2));
        System.out.println(quadrilateral1);

        Quadrate quadrate = new Quadrate(5.0, 5.0, 5.0, 5.0);

        System.out.println(quadrate.diagonal());

        Parallelogram parallelogram = new Parallelogram(5.0, 8.0, 5.0, 8.0, 30.0);

        System.out.println(parallelogram.square());
        System.out.println(parallelogram.diagonal());
        System.out.println(parallelogram.longDiagonal());
        System.out.println(parallelogram.height());

        Rectangle rectangle = new Rectangle(5.0, 8.0, 5.0, 8.0);

        System.out.println(rectangle.diagonal());
        System.out.println(rectangle.getNAME());

        Rhombus rhombus = new Rhombus(5.0, 6.0, 5.0, 6.0, 50.0);
        System.out.println(rhombus.height());
        System.out.println(rhombus.square());
        System.out.println(rhombus.diagonal());
        System.out.println(rhombus.longDiagonal());
    }
}