package hommework.lesson13.student.classUtil;

import hommework.lesson13.student.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class StudentUtil {

    private StudentUtil() {
    }

    public static void highAverageScore(List<Student> students) {
        if (students.size() == 0 || students == null) {
            System.out.println("Student list is empty or contains null");
            return;
        }

        Iterator<Student> iterator = students.iterator();

        Student studentA = new Student();
        Student studentB = new Student();
        Student studentC = new Student();

        while (iterator.hasNext()) {
            studentA = iterator.next();
            if (iterator.hasNext()) {
                studentB = iterator.next();
                if (iterator.hasNext()) {
                    if (studentA.getAverageScoreYear() >= studentB.getAverageScoreYear() && studentA.getAverageScoreYear() >= studentC.getAverageScoreYear()) {
                        studentC = studentA;
                    } else if (studentB.getAverageScoreYear() >= studentA.getAverageScoreYear() && studentB.getAverageScoreYear() >= studentC.getAverageScoreYear()) {
                        studentC = studentB;
                    }
                } else if (studentA.getAverageScoreYear() >= studentB.getAverageScoreYear() && studentA.getAverageScoreYear() >= studentC.getAverageScoreYear()) {
                    studentC = studentA;
                    System.out.println(studentC);
                } else if (studentB.getAverageScoreYear() >= studentA.getAverageScoreYear() && studentB.getAverageScoreYear() >= studentC.getAverageScoreYear()) {
                    studentC = studentB;
                    System.out.println(studentC);
                } else if (!iterator.hasNext()) {
                    System.out.println(studentC);
                }
            } else if (studentA.getAverageScoreYear() >= studentC.getAverageScoreYear()) {
                studentC = studentA;
                System.out.println(studentC);
            } else {
                System.out.println(studentC);
            }
        }
    }

    public static void nameIterator(List<Student> students) {
        if (students.size() == 0 || students == null) {
            return;
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String studentOne = o1.getFirstName() + o1.getLastName();
                String studentTwo = o2.getFirstName() + o2.getLastName();
                return Double.compare(studentOne.length(), studentTwo.length());
            }
        });
    }

    public static void ageIterator(List<Student> students) {
        if (students.size() == 0 || students == null) {
            return;
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    public static void averageMarkIterator(List<Student> students) {
        if (students.size() == 0 || students == null) {
            return;
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverageScoreYear(), o2.getAverageScoreYear());
            }
        });
    }
}