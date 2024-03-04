package Task_2_30;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Белокуров Артур Игоревич", 1);
        Student student2 = new Student("ФИО1", 3);
        Student student3 = new Student("ФИО2", 2);
        Student student4 = new Student("ФИО3", 5);
        Student student5 = new Student("ФИО4", 1);
        Student student6 = new Student("ФИО5", 1);
        Student student7 = new Student("ФИО6", 6);
        Student student8 = new Student("ФИО7", 6);
        Student student9 = new Student("ФИО8", 9);

        List<Student> students = new LinkedList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

/*        for (Student student : students) {
            System.out.println(student.name + " " + student.course);
        }*/

        List<HashSet<Student>> sortedStudents = Solution.Solution(students);
        for (HashSet<Student> studentSet : sortedStudents) {
            for (Student student : studentSet) {
                System.out.println(student.name + " " + student.course);
            }
        }
    }

}
