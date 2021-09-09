package Java.Exercise1.Task1;

import static Java.Exercise1.Task1.TextInput.*;

public class Main {

    public static void main(String[] args) {
        TextInput text = new TextInput();
        showUniqueWords(text.list);
        showDuplicates(text.list);
    }
}

