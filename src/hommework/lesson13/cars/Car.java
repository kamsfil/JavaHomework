/*
Создать абстрактный класс Car, представляющий собой автомобиль.
Добавить в него поля: марка, модель, год выпуска + несколько своих.
Создать 4 класса, являющихся наследниками Car.
Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
Создать класс Garage, хранящий в себе HashMap автомобилей,
в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
Продемонстрировать работу гаража.
 */
package hommework.lesson13.cars;

import java.util.Objects;

public abstract class Car {
    private final String BRAND;
    private final String MODEL;
    private final int YEAR_ISSUE;
    private int mileage;
    private String color;

    public Car(String BRAND, String MODEL, int YEAR_ISSUE, int mileage, String color) {
        this.BRAND = BRAND;
        this.MODEL = MODEL;
        this.YEAR_ISSUE = YEAR_ISSUE;
        this.mileage = mileage;
        this.color = color;
    }

    public String getBRAND() {
        return BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getYEAR_ISSUE() {
        return YEAR_ISSUE;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return YEAR_ISSUE == car.YEAR_ISSUE && mileage == car.mileage && Objects.equals(BRAND, car.BRAND) && Objects.equals(MODEL, car.MODEL) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BRAND, MODEL, YEAR_ISSUE, mileage, color);
    }

    @Override
    public String toString() {
        return "Brand='" + BRAND + '\'' +
                ", model='" + MODEL + '\'' +
                ", year issue=" + YEAR_ISSUE +
                ", mileage=" + mileage +
                ", color='" + color + '\'';
    }
}