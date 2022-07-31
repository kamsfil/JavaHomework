/*
Создать собственный класс-исключение, сделав его проверяемым исключением.
 */
package hommework.lesson11.exception;

public class CustomCheckedException extends Exception {
    public CustomCheckedException() {
    }

    public CustomCheckedException(String message) {
        super(message);
    }

    public CustomCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomCheckedException(Throwable cause) {
        super(cause);
    }
}