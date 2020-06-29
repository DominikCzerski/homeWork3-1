package homeWork_8.firmaSzkoleniowa1;

public class Student extends Person {

    public Student(String name, String surname, Address address) {
        super(name, surname, address);
    }


    @Override
    public String toString() {
        return  getName() + " " + getSurname() ;
    }
}
