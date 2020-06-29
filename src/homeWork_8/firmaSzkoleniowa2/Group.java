package homeWork_8.firmaSzkoleniowa2;

import java.util.Arrays;

public class Group {

    private Student[] students;
    private Student student;
    private Instructor instructor;
    private String groupName;


    public Group(Student[] students, Instructor instructor, String groupName) {
        this.students = students;
        this.instructor = instructor;
        this.groupName = groupName;
    }

    public Group(Student student, Instructor instructor, String groupName) {
        this.student = student;
        this.instructor = instructor;
        this.groupName = groupName;
    }

       @Override
    public String toString() {
        return groupName;
    }
}
