package Hommework.lesson10;

public class ConverterV2 {

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

    private static StringBuffer M(int number) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < number) {
            sb.append("M");
            i++;
        }
        return sb;
    }

    private static String C(int number) {
        if (number == 4) {
            return "CD";
        } else if ((number != 0) && (number < 4)) {
            StringBuffer sb = new StringBuffer("");
            int i = 0;
            while (i < number) {
                sb.append("C");
                i++;
            }
            return sb.toString();
        } else if ((number > 4) && (number < 9)) {
            StringBuffer sb = new StringBuffer("");
            int i = 5;
            sb.append("D");
            while (i < number) {
                sb.append("C");
                i++;
            }
            return sb.toString();
        } else if (number == 9) {
            return "CM";
        } else return "";
    }

    private static String X(int number) {
        if (number == 4) {
            return "XL";
        } else if ((number != 0) && (number < 4)) {
            StringBuffer sb = new StringBuffer("");
            int i = 0;
            while (i < number) {
                sb.append("X");
                i++;
            }
            return sb.toString();
        } else if ((number > 4) && (number < 9)) {
            StringBuffer sb = new StringBuffer("");
            int i = 5;
            sb.append("L");
            while (i < number) {
                sb.append("X");
                i++;
            }
            return sb.toString();
        } else if (number == 9) {
            return "XC";
        } else return "";
    }

    private static String I(int number) {
        String[] a = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return a[number];
    }
}