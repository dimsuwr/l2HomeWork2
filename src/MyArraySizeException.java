public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super("Не корректный размер массива!");
    }
}
