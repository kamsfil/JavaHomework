package Hommework.lesson8;

import java.util.Objects;

public class Quadrilateral implements GeometricFigure {
    public final String NAME = "Quadrilateral";
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public double width() {
        double width = Math.min(Math.min(sideA, sideB), Math.min(sideC, sideD));
        return width;
    }

    public double length() {
        double length = Math.max(Math.max(sideA, sideB), Math.max(sideC, sideD));
        return length;
    }

    public double diagonal (){  //ДИАГОНАЛЬ
        return 0;
    }

    @Override
    public double square() {
        double length = length();
        double width = width();
        double square = length * width;
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = sideA + sideB + sideC + sideC;
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
        Quadrilateral that = (Quadrilateral) o;
        {
            return Double.compare(that.sideA, sideA) == 0 &&
                    Double.compare(that.sideB, sideB) == 0 &&
                    Double.compare(that.sideC, sideC) == 0 &&
                    Double.compare(that.sideD, sideD) == 0;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, sideD);
    }

    @Override
    public String toString() {
        return "Name = " + NAME + "\n" +
                "side A = " + sideA + "\n" +
                "side B = " + sideB + "\n" +
                "side C = " + sideC + "\n" +
                "side D = " + sideD;
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

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }
}