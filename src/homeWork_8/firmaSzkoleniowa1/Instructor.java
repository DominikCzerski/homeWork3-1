package homeWork_8.firmaSzkoleniowa1;

public class Instructor extends Person{

    public Instructor(String name, String surname, Address address) {
        super(name, surname, address);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() ;
    }
}
