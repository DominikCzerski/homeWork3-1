package homeWork_9.klimatyzacjaISpalanie;

public class DrivingTest {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car("BMW", 70, 7, false);
        System.out.println(vehicles[0].toString());
        Car bmw = (Car) vehicles[0];
        bmw.setClimatizationOn(true);
        System.out.println(vehicles[0].toString());
        vehicles[1] = new Truck("Volvo", 150, 10, false, 0);
        System.out.println(vehicles[1].toString());
        Truck truck = (Truck) vehicles[1];
        truck.setClimatizationOn(true);
        System.out.println(vehicles[1].toString());
        truck.setPackageWeight(1000);
        System.out.println(vehicles[1].toString());


    }
}
