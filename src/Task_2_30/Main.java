package Task_2_30;

import Task_2_30.Solution.Faculty;
import Task_2_30.Solution.SimpleLinkedList;
import Task_2_30.Solution.Student;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
/*        Student student1 = new Student("Белокуров Артур Игоревич", 1);
        Student student2 = new Student("ФИО1", 3);
        Student student3 = new Student("ФИО2", 2);
        Student student4 = new Student("ФИО3", 5);
        Student student5 = new Student("ФИО4", 1);
        Student student6 = new Student("ФИО5", 1);
        Student student7 = new Student("ФИО6", 6);
        Student student8 = new Student("ФИО7", 6);
        Student student9 = new Student("ФИО8", 9);

        SimpleLinkedList<Student> studentsList = new SimpleLinkedList<>();

        studentsList.addLast(student1);
        studentsList.addLast(student2);
        studentsList.addLast(student3);
        studentsList.addLast(student4);
        studentsList.addLast(student5);
        studentsList.addLast(student6);
        studentsList.addLast(student7);
        studentsList.addLast(student8);
        studentsList.addLast(student9);

        System.out.println("Before:");

        for (Student student : studentsList) {
            System.out.println(student.name + " - Курс: " + student.course);
        }

        System.out.println("\nAfter:");

        Faculty.sortStudents(studentsList);


        for (Student student : studentsList) {
            System.out.println(student.name + " - Курс: " + student.course);
        }
    }
}*/

