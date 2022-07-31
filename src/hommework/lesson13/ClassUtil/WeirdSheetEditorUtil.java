/*
Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку
"****" перед каждым четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте.
Например:
{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
->
{"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
 */
package hommework.lesson13.ClassUtil;

import java.util.ArrayList;
import java.util.List;

public final class WeirdSheetEditorUtil {

    private static final String STRING = "****";
    private static final int NUMBER_LETTERS = 4;

    private WeirdSheetEditorUtil() {
    }

    public static void markLength4(List<String> list) {
        if (list.isEmpty() || list == null) {
            System.out.println("The passed list is empty or does not exist");
            return;
        }

            List<String> listOne = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() == NUMBER_LETTERS) {
                    listOne.add(STRING);
                    listOne.add(list.get(i));
                } else {
                    listOne.add(list.get(i));
                }
            }

            list = new ArrayList<>(listOne);
            System.out.println(list);

    }
}