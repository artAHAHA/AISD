package Task_2_30;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<HashSet<Student>> Solution(List<Student> students){
        //1 способ
        //2 способ: пройти циклом с counter и посчитать сколько
        //людей с каждого курса, и зарезервировать для них позции в List
        HashSet<Student> firstCourse = new HashSet<>();
        HashSet<Student> secondCourse = new HashSet<>();
        HashSet<Student> thirdCourse = new HashSet<>();
        HashSet<Student> fourthCourse = new HashSet<>();
        HashSet<Student> fifthCourse = new HashSet<>();
        HashSet<Student> sixthCourse = new HashSet<>();

        for (Student student : students){
            switch (student.course){
                case 1:
                    firstCourse.add(student);
                    break;
                case 2:
                    secondCourse.add(student);
                    break;
                case 3:
                    thirdCourse.add(student);
                    break;
                case 4:
                    fourthCourse.add(student);
                    break;
                case 5:
                    fifthCourse.add(student);
                    break;
                case 6:
                    sixthCourse.add(student);
                    break;
                default:
                    break;
            }
        }
        List<HashSet<Student>> sortedStudents = new LinkedList<>();
        sortedStudents.add(firstCourse);
        sortedStudents.add(secondCourse);
        sortedStudents.add(thirdCourse);
        sortedStudents.add(fourthCourse);
        sortedStudents.add(fifthCourse);
        sortedStudents.add(sixthCourse);

        return sortedStudents;
    }
}
