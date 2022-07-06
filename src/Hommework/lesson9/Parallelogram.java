package Hommework.lesson9;

public class Parallelogram extends Quadrilateral {
    public final String NAME = "PARALLELOGRAM";
    private double obtuseAngle;
    private double length = length();
    private double width = width();

    public Parallelogram(double sideA, double sideB, double sideC, double sideD, double angle) {
        super(sideA, sideB, sideC, sideD);
        this.obtuseAngle = angle;
    }

    @Override
    public double square() {
        double square = length * width * Math.sin(Math.toRadians(obtuseAngle));
        return square;
    }

    @Override
    public double diagonal() {
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - 2 * length * width * Math.cos(Math.toRadians(obtuseAngle)));
        return diagonal;
    }

    public double longDiagonal (){
        double diagonal = diagonal();
        double longDiagonal = Math.sqrt(2*Math.pow(length,2)+2*Math.pow(width,2) - Math.pow(diagonal,2));
        return longDiagonal;
    }

    public double height() {
        double square = square();
        double height = square / length;
        return height;
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