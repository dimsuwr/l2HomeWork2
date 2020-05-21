public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super("Не корректные данные " + message);
    }
}
