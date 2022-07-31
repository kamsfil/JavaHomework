package hommework.lesson12;

import hommework.lesson12.classUtil.RandomNumbersTwoUtil;
import hommework.lesson12.classUtil.RandomNumbersUtil;
import hommework.lesson12.classUtil.CounterLetterUtil;

import java.io.File;
import java.io.IOException;

public class MainJava {
    public static void main(String[] args) throws IOException {
        CounterLetterUtil.counterLetterRepetition(new File("resources/Poem.txt"));

        RandomNumbersUtil.generatingAndSortingRandomNumbers();

        RandomNumbersTwoUtil.generatingRandomNumbersSorting();
        //В начале я написал реализацию с byte потоком, потом я понял что ничего не мешает мне использовать
        // символьный поток, написал новый класс, но старый решил тоже оставить
    }
}
