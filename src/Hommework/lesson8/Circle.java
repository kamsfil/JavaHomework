package Hommework.lesson8;

import java.util.Objects;

public class Circle implements GeometricFigure {
    public final String NAME = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double square = Math.PI * radius * radius;
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double diameter() {
        double perimeter = perimeter();
        double diameter = perimeter / Math.PI;
        return diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        {
            return Double.compare(circle.radius, radius) == 0;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Name = " + NAME + "\n" +
                "Radius = " + radius;
    }

    public String getNAME() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}