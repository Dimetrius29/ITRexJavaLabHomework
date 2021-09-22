package homework.exercise2.task3;

public class OutOfMemoryError {
    public void createError(int size) throws Error {
        if (size >= 1000 * 1000 * 1000) throw new java.lang.OutOfMemoryError("Metaspace");
    }

    public static void main(String[] args) {
        OutOfMemoryError error = new OutOfMemoryError();
        error.createError(1000 * 1000 * 1000);
    }
}