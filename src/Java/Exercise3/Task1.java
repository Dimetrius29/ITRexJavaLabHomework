package Java.Exercise3;

import java.util.stream.LongStream;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(final long number) {
        return LongStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}

