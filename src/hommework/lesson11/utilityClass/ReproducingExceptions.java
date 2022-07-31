/*
Создать утилитный класс, в котором должны быть методы воспроизводящие следующие исключительные ситуации (у методов должны быть понятные названия):
-Генерация NullPointerException. Отловите возникшее исключение и выведите stackTrace.
-Написать метод, который создаст, а затем отловит ArrayIndexOutOfBoundsException и корректно его обработает.
-Создать метод, выбрасывающий исключение IllegalArgumentException. Вызвать этот метод и отловить исключение.
Вывести в консоль сообщение этого исключения.
-Создать метод выбрасывающий одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав
в качестве причины отловленное (тип своего исключения должен соответствовать типу исключения из JDK – проверяемое или не проверяемое).
-Создать метод случайным образом выбрасывающий одно из 3-х исключений. Исключения выбрать самому. Вызвать этот метод в блоке
try-catch, отлавливающем каждое из 3-х по отдельности.
-Написать метод, который в 50% случаев бросает исключение. Вызвать этот метод в конструкции try-catch-finally.
Протестировать работу блока finally.
 */
package hommework.lesson11.utilityClass;

import java.util.Objects;

public final class ReproducingExceptions {
    public static void RuntimeException() {
    }

    //1
    public static String nullPointerCall(Objects obj) {
        obj = null;
        return obj.toString();
    }

    //2
    public static void arrayOutOfBounds() {
        try {
            int massif[] = new int[5];
            int validationArray = massif[5];
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("You are out of range");
        }
    }

    //3
    public static void IllegalArgument() {
        int number = 1;
        if (number > 0) {
            throw new IllegalArgumentException();
        }
    }

    //4
    public static void divideByZeroError() {
        int a = 1 / 0;
    }

    //5
    public static void randomlyThrowingException() {
        int random = (int) (Math.random() * 3);

        if (random == 0) {
            throw new ArithmeticException();
        }
        if (random == 1) {
            throw new NullPointerException();
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //6
    public static void throwingExceptionHalfTime() {
        int random = (int) (Math.random() * 2);

        if (random == 0) {
            throw new NullPointerException();
        }
    }
}