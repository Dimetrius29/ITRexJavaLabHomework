package homework.exercise1.task2;

public class Pikap extends Car {
    public Pikap(String brand, String model, String colour, int year) {
        super(brand, model, colour, year);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Pikap{" +
                "brand=" + getBrand() +
                ", model=" + getModel() +
                ", colour=" + getColour() +
                ", year=" + getYear() +
                '}';
    }
}
