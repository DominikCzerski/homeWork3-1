package homeWork_8.firmaSzkoleniowa1;

public class Person {

    private String name;
    private String surname;
    private Address address;

    public Person(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }
}
