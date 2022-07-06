package Hommework.lesson10;

public class Main {
    public static void main(String[] args) {
        boolean resultPaliandrome = new Palindrome().findPalindrome();
        System.out.println(resultPaliandrome);

        StringBuilder resultConverter = new StringBuilder();
        resultConverter = new ConverterV1().RomanNumeralConverter();
        System.out.println(resultConverter);

        ConverterV2 converterV2 = new ConverterV2();
        String a = converterV2.convert(2016);
        System.out.println(a);

        ConverterV3 converterV3 = new ConverterV3();
        String b = converterV3.convert(2016);
        System.out.println(b);

    }
}