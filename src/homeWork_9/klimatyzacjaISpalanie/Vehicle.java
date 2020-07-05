package homeWork_9.klimatyzacjaISpalanie;

import java.text.DecimalFormat;

public class Vehicle {

    private String name;
    private double tankCapacity;
    private double averageConsumption;

    public Vehicle(String name, double tankCapacity, double averageConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageConsumption = averageConsumption;
    }

    public String getName() {
        return name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAverageConsumption() {
        return averageConsumption;
    }

    public void setAverageConsumption(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    }


    public double range() {
        DecimalFormat df = new DecimalFormat("#.##");
        double range = (tankCapacity / averageConsumption) * 100;
        return Double.parseDouble(df.format(range));
    }

    @Override
    public String toString() {
        return "Vehicle name " + name + " is consuming " + averageConsumption + " and can drive for " + range();
    }
}
