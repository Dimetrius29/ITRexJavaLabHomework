package Java.Exercise1.Task2;

public class Van extends Car {
    public Van(String brand, String model, String colour, int year) {
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
        return "Van{" +
                "brand=" + getBrand() +
                ", model=" + getModel() +
                ", colour=" + getColour() +
                ", year=" + getYear() +
                '}';
    }
}
