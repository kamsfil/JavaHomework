/*
Создать собственный класс-исключение, сделав его НЕ проверяемым исключением.
 */
package Hommework.lesson11.exception;

public class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException() {
    }

    public CustomUncheckedException(String message) {
        super(message);
    }

    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomUncheckedException(Throwable cause) {
        super(cause);
    }
}