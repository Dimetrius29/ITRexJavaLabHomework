package homework.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        List<String> listOfBafWords = createBadWordsDetectingStream("hi bad boy buy a book", Arrays.asList("book", "bad", "king"))
                .collect(Collectors.toList());

        System.out.println(listOfBafWords);
    }

    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return badWords.stream()
                .filter((s) -> text.contains(s))
                .distinct()
                .sorted();
    }
}
