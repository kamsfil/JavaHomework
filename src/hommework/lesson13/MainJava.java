package hommework.lesson13;

import hommework.lesson13.ClassUtil.WeirdSheetEditorUtil;
import hommework.lesson13.ClassUtil.WorkWithTextUtil;
import hommework.lesson13.cars.*;
import hommework.lesson13.student.Student;
import hommework.lesson13.student.classUtil.StudentUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {
        WorkWithTextUtil.parseText(new File("resources/EnglishText.txt"));

        BMW car1 = new BMW("BMW","X7",2018,10450,"red");
        Audi car2 = new Audi("Audi","A4",2005,27550,"green");
        Volkswagen car3 = new Volkswagen("Volkswagen","Golf",2001,150000,"black");
        Honda car4 = new Honda("Honda","Civic",1995,78000,"orange");

        Garage garageForCars = new Garage();

        garageForCars.parking(car1,8);
        garageForCars.carDeparture(car1,2);
        garageForCars.getCarView(car1);

        List<String> listWordsOne = new ArrayList<>(List.of(new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}));

        WeirdSheetEditorUtil.markLength4(listWordsOne);

        Student student1 = new Student("Jeanne", "Dark", 21, 4.5);
        Student student2 = new Student("Stephen", "Hawking", 19, 10.0);
        Student student3 = new Student("George", "Washington", 23, 6.2);
        Student student4 = new Student("Albert", "Einstein", 21, 2.0);
        Student student5 = new Student("James", "Gosling", 18, 6.9);

        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

        System.out.println("highest GPA");
        StudentUtil.highAverageScore(students);

        System.out.println("\n"+"sort by length of name and surname");
        StudentUtil.nameIterator(students);
        System.out.println(students);
        System.out.println("\n"+"sort by age");
        StudentUtil.ageIterator(students);
        System.out.println(students);
        System.out.println("\n"+"grade by average score");
        StudentUtil.averageMarkIterator(students);
        System.out.println(students);
    }
}