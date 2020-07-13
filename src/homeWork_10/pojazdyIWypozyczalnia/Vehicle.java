package homeWork_10.pojazdyIWypozyczalnia;

public abstract class Vehicle implements Moveable{

    private String name;
    private int year;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
