package Java.Exercise2.Task4;

import java.util.List;

public class ListValidator {

    public boolean validate(List<Integer> randomList) throws ValidateException {
        for (Integer integer : randomList) {
            if (integer % 2 == 0) {
                throw new ValidateException(integer, "List not valid");
            }
        }

        return true;
    }

}
