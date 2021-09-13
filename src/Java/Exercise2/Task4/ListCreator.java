package Java.Exercise2.Task4;

import java.util.ArrayList;

public class ListCreator {
    ArrayList<Integer> list = new ArrayList<>();
    int a = 0;

    public void start() {
        ListCreator listCreator = new ListCreator();
        catchMyException(listCreator);
        System.out.println("Valid odd list:" + listCreator.list);
    }

    public void catchMyException(ListCreator listCreator) {
        while (true) {
            try {
                listCreator.validator();
                break;
            } catch (MyException ex) {
                log(ex);
                listCreator.list.clear();
            }
        }
    }

    public void listCreator() {
        for (int i = 0; i < 3; i++) {
            list.add(i, (int) (1 + Math.random() * 9));
        }
    }

    public void validator() throws MyException {
        listCreator();
        try {
            for (int i = 0; i < 3; i++) {
                if (list.get(i) % 2 == 0) {
                    a = list.get(i);
                    produceMyException();
                }
            }
        } catch (MyException ex) {
            System.out.println(ex.getCustomField(list) + ex.getMessage());
            throw ex;
        }
    }

    public void produceMyException() {
        throw new MyException(list.toString(), "Even number: " + a);
    }

    public void log(Object obj) {
        System.out.println("We catch: " + obj.getClass().getName());
    }
}
