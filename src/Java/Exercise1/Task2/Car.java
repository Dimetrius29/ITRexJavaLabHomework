package Java.Exercise1.Task2;

import java.util.Objects;

public abstract class Car {


    private final String brand;
    private final String model;
    private final String colour;
    private final int year;

    public Car(String brand, String model, String colour, int year) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, colour, year);
    }
}
