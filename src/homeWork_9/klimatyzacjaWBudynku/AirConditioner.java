package homeWork_9.klimatyzacjaWBudynku;

import java.text.DecimalFormat;

public class AirConditioner {

    private double limitValue;

    public AirConditioner(double limitValue) {
        this.limitValue = limitValue;
    }

    public void controlTemperature(Room room) {
        double temperature = room.getTemperature();
        double lowerValue = 1 / room.getArea();
        if (temperature - lowerValue >= limitValue) {
            room.setTemperature(temperature - lowerValue);
        }

    }
}
