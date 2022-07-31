package hommework.lesson12.classUtil;

import java.io.*;
import java.util.Arrays;

public class RandomNumbersTwoUtil {
    private RandomNumbersTwoUtil() {
    }

    public static void generatingRandomNumbersSorting() {
        String sep = File.separator;

        File fileNotSortArrayNumbers = new File("resources" + sep + "Random_Numbers_Byte.txt");
        File fileSortNumbers = new File("resources" + sep + "Sort_Random_Numbers_Byte.txt");

        RandomNumbersTwoUtil.outputArrayRandomNumbers(fileNotSortArrayNumbers);
        RandomNumbersTwoUtil.SortRandomNumbers(fileNotSortArrayNumbers, fileSortNumbers);
    }

    public static void outputArrayRandomNumbers(File file) {
        try (FileOutputStream bais = new FileOutputStream(file)) {
            byte[] randomNumbersNotSort = new byte[100];

            for (int i = 0; i < 100; i++) {
                byte randomNumber = (byte) (Math.random() * 500);
                randomNumbersNotSort[i] = randomNumber;
            }
            //Почему идёт генерация не только положительных, но и отрицательных чисел. Всё дело в типе byte ?
            bais.write(randomNumbersNotSort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SortRandomNumbers(File downloadFile, File uploadFile) {
        try (FileInputStream fis = new FileInputStream(downloadFile)) {
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            byte[] mas = bytes;
            Arrays.sort(mas);

            RandomNumbersTwoUtil.outputNumbers(mas,uploadFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputNumbers (byte [] bytes,File file){
        try (FileWriter fw = new FileWriter(file)){
            for(int i = 0; i < bytes.length; i++){
                fw.write(String.valueOf(bytes[i]+" "));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}