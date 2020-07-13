package homeWork_10.pojazdyIWypozyczalnia;

public class Car extends Vehicle{

    private int seats;

    public Car(int seats) {
        this.seats = seats;
    }

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

}
