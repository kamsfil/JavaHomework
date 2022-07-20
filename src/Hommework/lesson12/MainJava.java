package Hommework.lesson12;

import Hommework.lesson12.utilityClass.UtilityClass;

import java.io.File;
import java.io.IOException;

public class MainJava {
    public static void main(String[] args) throws IOException {
        UtilityClass.counterLetterRepetition(new File("resources/Poem.txt"));


    }
}
