package Java.Exercise2.Task4;

public class ValidateException extends Exception {

    private final Integer notValidNumber;

    public Integer getNotValidNumber() {
        return notValidNumber;
    }

    public ValidateException(Integer notValidNumber, String msg) {
        super(msg);
        this.notValidNumber = notValidNumber;
    }

}
