package Hommework.lesson8;

import java.util.Objects;

public class Triangle implements GeometricFigure {
    public final String NAME = "TRIANGLE";
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double height() {
        return 0;
    }

    @Override
    public double square() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 &&
                Double.compare(triangle.sideB, sideB) == 0 &&
                Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "Name = " + NAME + "\n" +
                "sideA = " + sideA + "\n" +
                "sideB = " + sideB + "\n" +
                "sideC = " + sideC;
    }

    public String getNAME() {
        return NAME;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}