package homeWork_9.klimatyzacjaWBudynku;

import java.text.DecimalFormat;

public class Room {

    private double temperature;
    private int number;
    AirConditioner airConditioner;
    private double area;

    public Room(double temperature, int number, AirConditioner airConditioner, double area) {
        this.temperature = temperature;
        this.number = number;
        this.airConditioner = airConditioner;
        this.area = area;
    }

    public double getTemperature() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(temperature));
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
