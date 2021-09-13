package Java.Exercise2.Task4;

import java.util.ArrayList;

public class MyException extends RuntimeException {

    private String customField;

    public String getCustomField(ArrayList<Integer> list){
        return customField;
    }

    public MyException (String customField, String msg){
        super(msg);
        this.customField=customField;
    }
}
