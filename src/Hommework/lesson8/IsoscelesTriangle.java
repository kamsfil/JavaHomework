package Hommework.lesson8;

public class IsoscelesTriangle extends Triangle {
    public final String NAME = "Isosceles Triangle";
    private double side = 0.0;
    private double base = 0.0;

    public IsoscelesTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        findingSides();
    }

    @Override
    public double height() {
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(base, 2) / 4);
        return height;
    }

    @Override
    public double square() {
        double square = base / 4 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(base, 2));
        return square;
    }

    private void findingSides() {
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();

        if (a != b) {
            if (a == c) {
                side = a;
                base = b;
            }
        } else {
            side = a;
            base = b;
        }
    }

    @Override
    public String getNAME() {
        return NAME;
    }
}