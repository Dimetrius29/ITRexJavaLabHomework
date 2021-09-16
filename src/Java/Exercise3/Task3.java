package Java.Exercise3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> listOfFilteredInt = createFilteringStream(IntStream.of(1, 2, 3, 4), IntStream.of(30, 75, 60, 90))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(listOfFilteredInt);
    }

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream).filter((s) -> (s % 3 == 0 && s % 5 == 0)).sorted().skip(2);
    }
}
