package hommework.lesson11;

import hommework.lesson11.exception.CustomUncheckedException;
import hommework.lesson11.exception.DivideByZeroError;
import hommework.lesson11.utilityClass.ReproducingExceptions;

public class MainJava {
    public static void main(String[] args) throws ArithmeticException {
//1
        try {
            ReproducingExceptions.nullPointerCall(null);
        } catch (CustomUncheckedException e) {
            e.printStackTrace();
        }
//2
        ReproducingExceptions.arrayOutOfBounds();
//3
        try {
            ReproducingExceptions.IllegalArgument();
        } catch (IllegalArgumentException e2) {
            System.out.println("Illegal argument exception");
        }
//4
        try {
            ReproducingExceptions.divideByZeroError();
        } catch (ArithmeticException e5) {
            throw new DivideByZeroError("ArithmeticException");
        }
//5
        try {
            ReproducingExceptions.randomlyThrowingException();
        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic exception");
        } catch (NullPointerException e2) {
            System.out.println("Null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("Array index out of bounds exception");
        }
//6
        try {
            ReproducingExceptions.throwingExceptionHalfTime();
        } catch (NullPointerException e4) {
            System.out.println("Null pointer exception");
        } finally {
            System.out.println("This text is always displayed");
        }
    }
}