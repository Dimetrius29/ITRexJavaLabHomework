package Java.Exercise2.Task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListCreator listCreator = new ListCreator();
        List<Integer> integers = listCreator.generateList();

        System.out.println("valid list: " + integers);
    }
}
