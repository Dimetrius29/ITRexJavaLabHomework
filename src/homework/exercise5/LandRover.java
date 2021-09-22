package homework.exercise5;

import java.util.function.IntConsumer;

public class LandRover {
    private final int n;
    private int count = 1;

    public LandRover(int n) {
        if ((n < 1) || (n > 50)) {
            throw new IllegalArgumentException("Constraints: enter number from 1 to 50");
        }
        this.n = n;
    }

    // printLand.run() outputs "land".
    public synchronized void land(Runnable printLand) throws InterruptedException {
        while (count <= n) {
            if ((count % 3 == 0) && !(count % 5 == 0)) {
                printLand.run();
                count++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    // printRover.run() outputs "rover".
    public synchronized void rover(Runnable printRover) throws InterruptedException {
        while (count <= n) {
            if (!(count % 3 == 0) && (count % 5 == 0)) {
                printRover.run();
                count++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    // printLandRover.run() outputs "landrover".
    public synchronized void landrover(Runnable printLandRover) throws InterruptedException {
        while (count <= n) {
            if ((count % 3 == 0) && (count % 5 == 0)) {
                printLandRover.run();
                count++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while (count <= n) {
            if (!(count % 3 == 0) && !(count % 5 == 0)) {
                printNumber.accept(count);
                count++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
}
