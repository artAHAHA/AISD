package Task_2_30.Solution;


public class Solution {
    public static void solution(SimpleLinkedList<Student> students) {

        SimpleLinkedList<Student>[] courseLists = new SimpleLinkedList[]{
                new SimpleLinkedList<Student>(),
                new SimpleLinkedList<Student>(),
                new SimpleLinkedList<Student>(),
                new SimpleLinkedList<Student>(),
                new SimpleLinkedList<Student>(),
                new SimpleLinkedList<Student>()
        };

        for (Student student : students) {
            if(1 <= student.course && student.course <= 6) {
                courseLists[student.course - 1].addFirst(student);
            }
        }

        students.clear();

        for (SimpleLinkedList<Student> courseList : courseLists) {
            for (Student student : courseList) {
                students.addLast(student);
            }
        }
    }
}
