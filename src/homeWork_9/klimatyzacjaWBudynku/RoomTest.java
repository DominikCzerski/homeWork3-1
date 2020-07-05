package homeWork_9.klimatyzacjaWBudynku;

public class RoomTest {

    public static void main(String[] args) {
        BasicAirConditioner basicAirConditioner = new BasicAirConditioner(16.7);
        ProAirConditioner proAirConditioner = new ProAirConditioner(14.5);
        Room livingRoom = new Room(15, 10, proAirConditioner, 10);
        Room bathRoom = new Room(17, 10, basicAirConditioner, 10);
        livingRoom.airConditioner.controlTemperature(livingRoom);
        livingRoom.airConditioner.controlTemperature(livingRoom);
        livingRoom.airConditioner.controlTemperature(livingRoom);
        System.out.println("Temperature in room is " + livingRoom.getTemperature());

        bathRoom.airConditioner.controlTemperature(bathRoom);
        bathRoom.airConditioner.controlTemperature(bathRoom);
        bathRoom.airConditioner.controlTemperature(bathRoom);
        bathRoom.airConditioner.controlTemperature(bathRoom);
        System.out.println("Temperature in room is " + bathRoom.getTemperature());


    }
}
