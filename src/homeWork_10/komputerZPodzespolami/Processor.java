package homeWork_10.komputerZPodzespolami;

public class Processor extends Component implements Overclockingable {

    private int clockSpeed = 3000;
    private double temperature;
    private double maximalTemperature;

    public Processor(String name, String producent, String serialNumber, double temperature, double maximalTemperature) {
        super(name, producent, serialNumber, temperature, maximalTemperature);
        this.temperature = temperature;
        this.maximalTemperature = maximalTemperature;

    }

    @Override
    public void increaseSpeed(int increaseAmount) {
        int temperatureIncrease = (increaseAmount / 100) * 10;
        if (maximalTemperature > (temperature + temperatureIncrease)) {
            clockSpeed += increaseAmount;
            temperature += temperatureIncrease;
        } else {
            System.out.println("Warning, this operation can damage the component");
        }
        
    }

    @Override
    public String toString() {
        return "Processor" +
                "clockSpeed=" + clockSpeed +
                ", temperature=" + temperature;
    }
}
