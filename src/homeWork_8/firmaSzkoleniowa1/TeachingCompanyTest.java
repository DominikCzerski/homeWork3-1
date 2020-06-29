package homeWork_8.firmaSzkoleniowa1;

public class TeachingCompanyTest {

    public static void main(String[] args) {
        Address instructorDominikAddress = new Address("Lubelska", "12", "Lublin");
        Instructor instructorDominik = new Instructor("Dominik", "Wałęcki", instructorDominikAddress);

        Address studentMichalAddress = new Address("Wileńska", "21", "Warszawa");
        Student studentMichal = new Student("Michał", "Damiencki",studentMichalAddress);

        Address studentMarcinAddress = new Address("Pogodna", "13", "Poznań");
        Student studentMarcin = new Student("Marcin", "Woliński",studentMarcinAddress);

        Group group = new Group(new Student[]{studentMarcin, studentMichal}, instructorDominik, "Programowanie");
        System.out.println(group.toString());
    }
}
