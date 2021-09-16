package Java.Exercise3;

import java.util.stream.LongStream;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return LongStream.rangeClosed(1, n)
                    .reduce(1, (long a, long b) -> a * b);
        }
    }
}
