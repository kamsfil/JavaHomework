/*
Задан текст на английском языке. Выделить все различные слова.
Для каждого слова подсчитать частоту его встречаемости.
Слова, отличающиеся регистром букв, считать различными.
 */
package hommework.lesson13.ClassUtil;

import java.io.*;
import java.util.*;

public final class WorkWithTextUtil {

    private WorkWithTextUtil (){
    }

    public static void parseText (File file) {
        if(file == null || file.length() == 0){
            System.out.println("File is empty or its value is null");
            return;
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))){
            String textOne = "";
            String textTwo = "";

            while ((textOne = fileReader.readLine()) != null){

               textOne = textOne.replaceAll("\\p{Punct}", "");
               textTwo += textOne;
            }

            String [] arrayString = textTwo.split(" ");

            Set <String> uniqueWords = new HashSet<>(List.of(arrayString));
            Map <String, Integer> wordRepetitionFrequency = new HashMap<>();

            for(String s : arrayString){
                if(wordRepetitionFrequency.containsKey(s)){
                    wordRepetitionFrequency.put(s, wordRepetitionFrequency.get(s)+1);
                }else {
                    wordRepetitionFrequency.put(s,1);
                }
            }

            System.out.println(wordRepetitionFrequency);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}