package Java.Exercise1.Task2;

import java.util.*;

public class Garage {

    HashMap<Car, Integer> availableCars = new HashMap<>();

    public void park(Car car) {
        if (car == null) return;
        if (!availableCars.containsKey(car)) {
            availableCars.put(car, 0);
        }
        availableCars.put(car, availableCars.get(car) + 1);
    }

    public void moveOut(Car car) {
        if (car == null) return;
        if (!availableCars.containsKey(car)) return;
        availableCars.put(car, availableCars.get(car) - 1);
        if (availableCars.get(car) == 0) {
            availableCars.remove(car);
        }
    }

    public int equalCars(Car car) {
        if (!availableCars.containsKey(car)) {
            return 0;
        }
        return availableCars.get(car);
    }
}
