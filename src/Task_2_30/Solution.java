package Task_2_30;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void Solution(List<Student> students) {
        List<Student> firstCourse = new LinkedList<>();
        List<Student> secondCourse = new LinkedList<>();
        List<Student> thirdCourse = new LinkedList<>();
        List<Student> fourthCourse = new LinkedList<>();
        List<Student> fifthCourse = new LinkedList<>();
        List<Student> sixthCourse = new LinkedList<>();

        List<Student> studentsToRemove = new LinkedList<>();

        for (Student student : students) {
            switch (student.course) {
                case 1 -> firstCourse.add(student);
                case 2 -> secondCourse.add(student);
                case 3 -> thirdCourse.add(student);
                case 4 -> fourthCourse.add(student);
                case 5 -> fifthCourse.add(student);
                case 6 -> sixthCourse.add(student);
                default -> {
                }
            }
            studentsToRemove.add(student);
        }

        students.removeAll(studentsToRemove);

        students.addAll(firstCourse);
        students.addAll(secondCourse);
        students.addAll(thirdCourse);
        students.addAll(fourthCourse);
        students.addAll(fifthCourse);
        students.addAll(sixthCourse);

    }
}
