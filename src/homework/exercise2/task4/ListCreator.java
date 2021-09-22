package homework.exercise2.task4;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {

    private final ListValidator validator = new ListValidator();

    public List<Integer> generateList() {
        List<Integer> randomList = generateRandomList();
        try {
            validator.validate(randomList);
        } catch (ValidateException ex) {
            System.out.println("List: " + randomList + " contains not valid value: " + ex.getNotValidNumber());
            randomList = generateList();
        }

        return randomList;
    }

    private List<Integer> generateRandomList() {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomList.add(i, (int) (1 + Math.random() * 9));
        }

        return randomList;
    }

}
