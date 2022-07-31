package hommework.lesson9;

public class Rhombus extends Quadrilateral {
    public final String NAME = "RHOMBUS";
    private double obtuseAngle;
    private double length = length();
    private double width = width();
    private double side = getSideA();

    public Rhombus(double sideA, double sideB, double sideC, double sideD, double obtuseAngle) {
        super(sideA, sideB, sideC, sideD);
        this.obtuseAngle = obtuseAngle;
    }

    public double height() {
        double height = side * Math.sin(Math.toRadians(obtuseAngle));
        return height;
    }

    @Override
    public double square() {
        double height = height();
        double square = side * height;
        return square;
    }

    @Override
    public double diagonal() {
        double diagonal = side * Math.sqrt(2 + 2 * Math.cos(Math.toRadians(obtuseAngle)));
        return diagonal;
    }

    public double longDiagonal (){
        double diagonal = diagonal();
        double longDiagonal = Math.sqrt(4*Math.pow(side,2)-Math.pow(diagonal,2));
        return longDiagonal;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    public double getObtuseAngle() {
        return obtuseAngle;
    }

    public void setObtuseAngle(double obtuseAngle) {
        this.obtuseAngle = obtuseAngle;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}