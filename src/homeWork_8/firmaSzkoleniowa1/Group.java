package homeWork_8.firmaSzkoleniowa1;

import java.util.Arrays;

public class Group {

    private Student [] students;
    private Instructor instructor;
    private String groupName;

    public Group(Student[] students, Instructor instructor, String groupName) {
        this.students = students;
        this.instructor = instructor;
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Group " + getGroupName() + " consists of " + "students: " + "\n"
                + Arrays.toString(students) + "\n" +
                "The instructor of this group will be " + instructor.toString();
    }
}
