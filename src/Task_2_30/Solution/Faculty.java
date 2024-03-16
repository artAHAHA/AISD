package Task_2_30.Solution;

import java.util.Scanner;

public class Faculty {
    private SimpleLinkedList<Student>[] courseLists;
    private final int countCourses = 6;

    public static void sortStudents(SimpleLinkedList<Student> students) {
        Faculty faculty = new Faculty();
//        faculty.getCountCourses();
        faculty.initializeCourseLists(faculty.countCourses);
        faculty.addStudents(students);
        faculty.mergeStudents(students);
    }

/*    private void getCountCourses() {
        Scanner sc = new Scanner(System.in);
        countCourses = sc.nextInt();
    }*/

    private void initializeCourseLists(int countCourses) {
        courseLists = new SimpleLinkedList[countCourses];
        for (int i = 0; i < countCourses; i++) {
            courseLists[i] = new SimpleLinkedList<Student>();
        }
    }

    private void addStudents(SimpleLinkedList<Student> students) {
        for (Student student : students) {
            if (1 <= student.course && student.course <= countCourses) {
                courseLists[student.course - 1].addFirst(student);
            }
        }
    }

    private void mergeStudents(SimpleLinkedList<Student> students) {
        students.clear();
        for (SimpleLinkedList<Student> courseList : courseLists) {
            for (Student student : courseList) {
                students.addLast(student);
            }
        }
    }
}