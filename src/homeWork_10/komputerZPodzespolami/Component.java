package homeWork_10.komputerZPodzespolami;

public abstract class Component {

    private String name;
    private String producent;
    private String serialNumber;
    private double temperature;
    private double maximalTemperature;

    public Component(String name, String producent, String serialNumber, double temperature, double maximalTemperature) {
        this.name = name;
        this.producent = producent;
        this.serialNumber = serialNumber;
        this.temperature = temperature;
        this.maximalTemperature = maximalTemperature;
    }
}
