package homeWork_10.pojazdyIWypozyczalnia;

public class MotorBike extends Vehicle {

    private int speedLimit;

    @Override
    public String turnLeft() {
        return "Turning left";
    }

    @Override
    public String turnRight() {
        return "Turning right";
    }

    @Override
    public String goForward() {
        return "Going forward";
    }

    @Override
    public String goBack() {
        return "Going back";
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "speedLimit=" + speedLimit +
                '}';
    }
}
