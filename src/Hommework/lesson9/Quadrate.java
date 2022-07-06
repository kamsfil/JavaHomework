package Hommework.lesson9;

public class Quadrate extends Quadrilateral {
    public final String NAME = "QUADRATE";

    public Quadrate(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);
        if (sideA != sideB || sideA != sideC || sideA != sideD) {
            throw new RuntimeException("figure is not a quadrate");
        }
    }

    @Override
    public double diagonal (){
        double diagonal = Math.sqrt(Math.pow(getSideA(),2)*2);
        return diagonal;
    }

    @Override
    public String getNAME() {
        return NAME;
    }
}