package Java.Exercise1.Task2;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Pikap("BMW", "Z-1", "Red", 2005));
        garage.park(new Pikap("BMW", "Z-1", "Red", 2005));
        garage.park(new Van("BMW", "Z-1", "Red", 2005));
        System.out.println(garage.availableCars);
        garage.moveOut(new Pikap("BMW", "Z-1", "Red", 2005));
        System.out.println(garage.availableCars);
        garage.moveOut(new Pikap("BMW", "Z-1", "Red", 2005));
        System.out.println(garage.availableCars);
        System.out.println(garage.equalCars(new Pikap("BMW", "Z-1", "Red", 2005)));
    }
}
