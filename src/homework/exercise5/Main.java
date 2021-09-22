package homework.exercise5;

public class Main {

    public static void main(String[] args) {
        LandRover landRover = new LandRover(15);

        Thread threadA = new Thread(() -> {
            try {
                landRover.land(Printer.getPrintLand());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                landRover.rover(Printer.getPrintRover());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                landRover.landrover(Printer.getPrintLandRover());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                landRover.number(Printer.getPrintNumber());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
