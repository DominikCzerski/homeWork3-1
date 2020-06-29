package homeWork_8.firmaSzkoleniowa2;

public class Grade {
    private Group group;
    private Student student;
    private int grade;

    public Grade(Group group, Student student, int grade) {
        this.group = group;
        this.student = student;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade of " + student + " in " + group + " is " + grade;
    }
}
