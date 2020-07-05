package homeWork_9.klimatyzacjaWBudynku;

public class ProAirConditioner extends AirConditioner {

    private double limitValue;

    public ProAirConditioner(double limitValue) {
        super(limitValue);
        this.limitValue = limitValue;
    }

    @Override
    public void controlTemperature(Room room) {
        double temperature = room.getTemperature();
        double lowerValue = 2 / room.getArea();
        if ((temperature - lowerValue) >= limitValue) {
            room.setTemperature(temperature - lowerValue);
        }
    }
}
