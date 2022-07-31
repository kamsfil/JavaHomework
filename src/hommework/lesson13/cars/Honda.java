package hommework.lesson13.cars;

public class Honda extends Car {

    public Honda(String BRAND, String MODEL, int YEAR_ISSUE, int mileage, String color) {
        super(BRAND, MODEL, YEAR_ISSUE, mileage, color);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
