package homeWork_10.pojazdyIWypozyczalnia;

public class CarRentalTest {

    public static void main(String[] args) {
        Person andrew = new Person();
        Person mike = new Person();
        RentableCar [] cars = new RentableCar[2];
        cars[0] = new RentableCar(5, andrew);
        cars[1] = new RentableCar(5, mike);
        cars[0].rent("Andrew", "Golota", "15");
        System.out.println(cars[0]);
        cars[0].handOver();
        System.out.println(cars[0]);
        cars[1].rent("Mike", "Wolin", "16");
        System.out.println(cars[1]);
        cars[1].handOver();
        System.out.println(cars[1]);

    }
}
