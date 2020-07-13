package homeWork_10.pojazdyIWypozyczalnia;

public class RentableCar extends Car implements Rentable{

    private Person person;
    private String id;
    private boolean isRent;

    public RentableCar(int seats, Person person) {
        super(seats);
        this.person = person;
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
    person.setFirstName(firstName);
    person.setLastName(lastName);
    this.id = id;
    isRent = true;
    }

    @Override
    public void handOver() {
    person = null;
    isRent = false;
    id = "0";
    }

    @Override
    public boolean isRent() {
        return isRent;
    }

    @Override
    public String toString() {
        return "The car was rented by " + person + " id of rental is " + id + " and the car is currently rented " + isRent();
    }
}
