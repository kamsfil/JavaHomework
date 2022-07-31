package hommework.lesson10;

import java.util.Scanner;

public class Palindrome {

    public static boolean findPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String wordCheck = scanner.nextLine();

        for (int i = 0; i < wordCheck.length() / 2; i++) {
            if (wordCheck.charAt(i) != wordCheck.charAt(wordCheck.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}