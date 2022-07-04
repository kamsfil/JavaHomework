package Hommework.lesson8;

public class Rectangle extends Quadrilateral {
    public final String NAME = "RECTANGLE";
    private double length = length();
    private double width = width();

    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);
    }

    @Override
    public double diagonal() {
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diagonal;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}