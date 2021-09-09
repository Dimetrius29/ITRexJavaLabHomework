package Java.Exercise1.Task2;

public class Coupe extends Car {
    public Coupe(String brand, String model, String colour, int year) {
        super(brand, model, colour, year);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Coupe{" +
                "brand=" + getBrand() +
                ", model=" + getModel() +
                ", colour=" + getColour() +
                ", year=" + getYear() +
                '}';
    }
}