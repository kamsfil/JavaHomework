package Hommework.lesson10;

import java.util.Scanner;

public class ConverterV1 {

    public static StringBuilder RomanNumeralConverter() {
        Scanner scanner = new Scanner(System.in);
        int arabicNumeral = scanner.nextInt();
        StringBuilder romanNumerals = new StringBuilder();
        int validationVariable = 0;

        if (arabicNumeral / 1000 >= 1) {
            validationVariable = arabicNumeral / 1000;
            switch (validationVariable) {
                case 1:
                    romanNumerals.append("M");
                    break;
                case 2:
                    romanNumerals.append("MM");
                    break;
                case 3:
                    romanNumerals.append("MMM");
                    break;
            }
            arabicNumeral = arabicNumeral % 1000;
        }

        if (arabicNumeral / 100 >= 1) {
            validationVariable = arabicNumeral / 100;
            switch (validationVariable) {
                case 1:
                    romanNumerals.append("C");
                    break;
                case 2:
                    romanNumerals.append("CC");
                    break;
                case 3:
                    romanNumerals.append("CCC");
                    break;
                case 4:
                    romanNumerals.append("CD");
                    break;
                case 5:
                    romanNumerals.append("D");
                    break;
                case 6:
                    romanNumerals.append("DC");
                    break;
                case 7:
                    romanNumerals.append("DCC");
                    break;
                case 8:
                    romanNumerals.append("DCCC");
                    break;
                case 9:
                    romanNumerals.append("CM");
                    break;
            }
            arabicNumeral = arabicNumeral % 100;
        }

        if (arabicNumeral / 10 >= 1) {
            validationVariable = arabicNumeral / 10;
            switch (validationVariable) {
                case 1:
                    romanNumerals.append("X");
                    break;
                case 2:
                    romanNumerals.append("XX");
                    break;
                case 3:
                    romanNumerals.append("XXX");
                    break;
                case 4:
                    romanNumerals.append("XL");
                    break;
                case 5:
                    romanNumerals.append("L");
                    break;
                case 6:
                    romanNumerals.append("LX");
                    break;
                case 7:
                    romanNumerals.append("LXX");
                    break;
                case 8:
                    romanNumerals.append("LXXX");
                    break;
                case 9:
                    romanNumerals.append("XC");
                    break;
            }
            arabicNumeral = arabicNumeral % 10;
        }

        if (arabicNumeral >= 1)
            switch (arabicNumeral) {
                case 1:
                    romanNumerals.append("I");
                    break;
                case 2:
                    romanNumerals.append("II");
                    break;
                case 3:
                    romanNumerals.append("III");
                    break;
                case 4:
                    romanNumerals.append("IV");
                    break;
                case 5:
                    romanNumerals.append("V");
                    break;
                case 6:
                    romanNumerals.append("VI");
                    break;
                case 7:
                    romanNumerals.append("VII");
                    break;
                case 8:
                    romanNumerals.append("VIII");
                    break;
                case 9:
                    romanNumerals.append("IX");
                    break;
            }
        return romanNumerals;
    }
}