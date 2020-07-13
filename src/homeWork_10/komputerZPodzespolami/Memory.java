package homeWork_10.komputerZPodzespolami;

public class Memory extends Component implements Overclockingable {

    private int clockSpeed = 1066;
    private int size;
    private double temperature;
    private double maximalTemperature;

    public Memory(String name, String producent, String serialNumber, double temperature, double maximalTemperature, int size) {
        super(name, producent, serialNumber, temperature, maximalTemperature);
        this.size = size;
        this.temperature = temperature;
        this.maximalTemperature = maximalTemperature;
    }

    @Override
    public void increaseSpeed(int increaseAmount) {
        int temperatureIncrease = (increaseAmount/100) * 15;
        if(maximalTemperature > (temperature + temperatureIncrease)){
            clockSpeed += increaseAmount;
            temperature += temperatureIncrease;
        } else {
            System.out.println("Warning, this operation can damage the component");
        }
    }


    @Override
    public String toString() {
        return "Memory" +
                "clockSpeed=" + clockSpeed +
                ", temperature=" + temperature;
    }
}
