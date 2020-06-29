package homeWork_8.firmaSzkoleniowa2;

public class TeachingCompanyTest {

    public static void main(String[] args) {
        Address instructorDominikAddress = new Address("Lubelska", "12", "Lublin");
        Instructor instructorDominik = new Instructor("Dominik", "Wałęcki", instructorDominikAddress);

        Address studentMichalAddress = new Address("Wileńska", "21", "Warszawa");
        Student studentMichal = new Student("Michał", "Damiencki", studentMichalAddress);


        Group[] studentMichalGroups = new Group[2];
        studentMichalGroups[0] = new Group(studentMichal, instructorDominik, "Programowanie");
        studentMichalGroups[1] = new Group(studentMichal, instructorDominik, "Malowanie");

        Grade studentMichalProgrammingGrade = new Grade(studentMichalGroups[0], studentMichal, 5);
        Grade studentMichalPaintingGrade = new Grade(studentMichalGroups[1], studentMichal, 3);

        System.out.println(studentMichalProgrammingGrade.toString() + "\n" + studentMichalPaintingGrade.toString());
    }
}
