package Hommework.lesson9;

public class EquilateralTriangle extends Triangle {
    public final String NAME = "EQUILATERAL_TRIANGLE";

    public EquilateralTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        if (sideA != sideB || sideA != sideC || sideB != sideC) {
            throw new RuntimeException("figure is not a equilateral triangle");
        }
    }

    @Override
    public double height() {
        double side = getSideA();
        double height = (Math.sqrt(3) * side) / 2;
        return height;
    }

    @Override
    public double square() {
        double height = height();
        double square = Math.pow(height, 2) / Math.sqrt(3);
        return square;
    }

    @Override
    public String getNAME() {
        return NAME;
    }
}