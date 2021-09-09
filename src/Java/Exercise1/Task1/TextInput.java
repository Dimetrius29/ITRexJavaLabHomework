package Java.Exercise1.Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TextInput {
    String inputText = "africa, america+ Asia! asia America Europe EUrope europe america is not EUrope";
    public List<String> list = Arrays.asList(inputText.split("[^a-zA-Z]+"));

    public static void showUniqueWords(List<String> list) {
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println("Unique words: " + hashSet);
    }

    public static void showDuplicates(List<String> list) {
        HashSet<String> set = new HashSet<>(list);
        for (String uniqueWord : set) {
            System.out.println(uniqueWord + ": " + Collections.frequency(list, uniqueWord));
        }
    }
}
