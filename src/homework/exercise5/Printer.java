package homework.exercise5;

import java.util.function.IntConsumer;

public class Printer {

    private final static Runnable printLand = () -> System.out.print("\"land\",");
    private final static Runnable printRover = () -> System.out.print("\"rover\",");
    private final static Runnable printLandRover = () -> System.out.print("\"landRover\",");
    private final static IntConsumer printNumber = n -> System.out.print(n + ",");

    public static Runnable getPrintLand() {
        return printLand;
    }

    public static Runnable getPrintRover() {
        return printRover;
    }

    public static Runnable getPrintLandRover() {
        return printLandRover;
    }

    public static IntConsumer getPrintNumber() {
        return printNumber;
    }
}
