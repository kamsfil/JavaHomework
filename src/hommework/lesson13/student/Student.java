/*
Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу.
 */
package hommework.lesson13.student;

import java.util.Objects;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private double averageScoreYear;

    public Student() {
    }

    public Student(String lastName, String firstName, int age, double averageScoreYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.averageScoreYear = averageScoreYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScoreYear() {
        return averageScoreYear;
    }

    public void setAverageScoreYear(int averageScoreYear) {
        this.averageScoreYear = averageScoreYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.averageScoreYear, averageScoreYear) == 0 && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age, averageScoreYear);
    }

    @Override
    public String toString() {
        return "last name = '" + lastName + '\'' +
                ", first name = '" + firstName + '\'' +
                ", age = " + age +
                ", average score year = " + averageScoreYear;
    }
}