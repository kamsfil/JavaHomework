package hommework.lesson11.exception;

public class DivideByZeroError extends RuntimeException {
    public DivideByZeroError() {
    }

    public DivideByZeroError(String message) {
        super(message);
    }

    public DivideByZeroError(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZeroError(Throwable cause) {
        super(cause);
    }
}