package hommework.lesson13.cars;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    public Garage() {
    }

    private Map<Car, Integer> garage = new HashMap<>();

    public void parking(Car car, int key) {
        if (garage.containsKey(car)) {
            garage.put(car, garage.get(car) + key);
        } else {
            garage.put(car, key);
        }
        System.out.println(key + " " + car.getBRAND() + " " + car.getMODEL() + " parks");
    }

    public void carDeparture(Car car, int key) {
        if (garage.containsKey(car)) {
            garage.replace(car, garage.get(car) - key);
        } else {
            garage.put(car, 0);
        }
        System.out.println(key + " " + car.getBRAND() + " " + car.getMODEL() + " pulled out of the garage");
    }

    public void getCarView(Car car) {
        System.out.println(garage.get(car) + " " + car.getBRAND() + " " + car.getMODEL() + " be in the garage");
    }
}