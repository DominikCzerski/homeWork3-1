package homeWork_9.klimatyzacjaWBudynku;

public class BasicAirConditioner extends AirConditioner {

    private double limitValue;

    public BasicAirConditioner(double limitValue) {
        super(limitValue);
        this.limitValue = limitValue;
    }

    @Override
    public void controlTemperature(Room room) {
        super.controlTemperature(room);
    }
}
