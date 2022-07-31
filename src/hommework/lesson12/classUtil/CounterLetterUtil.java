/*
1. Создать (можно вручную) файл со стихотворением(к примеру Александра Пушкина).
Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
Вывести результат в отдельный файл в виде:
     а - 15
     б - 7
     и т.д.
 */
package hommework.lesson12.classUtil;

import java.io.*;

public final class CounterLetterUtil {
    public CounterLetterUtil() {
    }

    public static void counterLetterRepetition(File file) {
        String[] literal = new String[]{"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int[] numberLiteral = new int[27];
        String textFromFile = "";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = fileReader.readLine()) != null) {
                textFromFile = textFromFile.concat(str);
            }

            String[] arrayFileTex = textFromFile.split("");

            for (int i = 1; i < literal.length; i++) {
                for (int e = 0; e < arrayFileTex.length; e++) {
                    if (literal[i].equalsIgnoreCase(arrayFileTex[e])) {
                        numberLiteral[i] = numberLiteral[i] + 1;
                    }
                }
            }

            for (int k = 1; k < numberLiteral.length; k++) {
                System.out.println(literal[k] + " - " + numberLiteral[k]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}