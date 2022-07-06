package Hommework.lesson10;

public class ConverterV3 {

    public static String convert(int arabicNumeral) {
        StringBuffer romanNumerals = new StringBuffer("");
        int a = arabicNumeral;
        int validationVariable = arabicNumeral;

        if (a > 999) {
            validationVariable = a / 1000;
            romanNumerals.append(M(validationVariable));
            a = a % 1000;
        }

        if (a > 99) {
            validationVariable = a / 100;
            romanNumerals.append(C(validationVariable));
            a = a % 100;
        }

        if (a > 9) {
            validationVariable = a / 10;
            romanNumerals.append(X(validationVariable));
            a = a % 10;
        }

        if (a > 0) {
            validationVariable = a;
            romanNumerals.append(I(validationVariable));
        }

        return romanNumerals.toString();
    }

    private static String M(int number) {
        String[] a = {"", "M", "MM", "MMM"};
        return a[number];
    }

    private static String C(int number) {
        String[] a = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        return a[number];
    }

    private static String X(int number) {
        String[] a = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return a[number];
    }

    private static String I(int number) {
        String[] a = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return a[number];
    }
}