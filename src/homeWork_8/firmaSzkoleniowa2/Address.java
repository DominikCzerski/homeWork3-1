package homeWork_8.firmaSzkoleniowa2;

public class Address {

    private String street;
    private String streetNumber;
    private String city;

    public Address(String street, String streetNumber, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Living on " + street + " " + streetNumber + " in " + city;
    }
}
