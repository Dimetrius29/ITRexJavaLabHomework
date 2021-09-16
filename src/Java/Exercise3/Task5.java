package Java.Exercise3;

import java.util.stream.LongStream;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(sumOfOddNumbersInRange(21, 23));
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end)
                .filter(s -> s % 2 != 0)
                .sum();
    }
}
