/*
Создать программно и заполнить файл случайными целыми числами.
Отсортировать содержимое файла по возрастанию и записать в новый файл.
 */
package Hommework.lesson12.ClassUtil;

import java.io.*;
import java.util.Arrays;

public final class RandomNumbersUtil {
    private RandomNumbersUtil() {
    }

    public static void generatingAndSortingRandomNumbers() {
        String separator = File.separator;

        File fileNotSortNumbers = new File("resources" + separator + "Random_Numbers_Char.txt");
        File fileSortNumbers = new File("resources" + separator + "Sort_Random_Numbers_Char.txt");

        RandomNumbersUtil.writeFileRandomNumbers(fileNotSortNumbers);
        int[] arrayIntNumbers = RandomNumbersUtil.getNumbersFromFile(fileNotSortNumbers);
        RandomNumbersUtil.writeNumbersFile(arrayIntNumbers, fileSortNumbers);
    }

    public static void writeFileRandomNumbers(File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 100; i++) {
                stringBuilder.append((int) (Math.random() * 500)).append(" ");
            }

            fileWriter.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] getNumbersFromFile(File file) {
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String str = bf.readLine();

            String[] arrayString = str.split(" ");
            int[] arrayNumbers = new int[arrayString.length];

            for (int i = 0; i < arrayString.length; i++) {
                arrayNumbers[i] = Integer.parseInt(arrayString[i]);
            }

            Arrays.sort(arrayNumbers);

            return arrayNumbers;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeNumbersFile(int[] arrayNumbers, File file) {
        try (FileWriter fw = new FileWriter(file)) {

            StringBuilder sbb = new StringBuilder();
            for (int i = 0; i < arrayNumbers.length; i++) {
                sbb.append(arrayNumbers[i] + " ");
            }

            fw.write(String.valueOf(sbb));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}