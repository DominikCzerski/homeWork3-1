package homeWork_9.klimatyzacjaISpalanie;

import java.text.DecimalFormat;

public class Truck extends Car {

    private double packageWeight;


    public Truck(String name, double tankCapacity, double averageConsumption, boolean isClimatizationOn, double packageWeight) {
        super(name, tankCapacity, averageConsumption, isClimatizationOn);
        this.packageWeight = packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    @Override
    public double range() {
        DecimalFormat df = new DecimalFormat("#.##");
        if (isClimatizationOn()) {
            setAverageConsumption(getAverageConsumption() + 1.6 + consumptionWithPackage());
            double range = (getTankCapacity() / getAverageConsumption()) * 100;
            return Double.parseDouble(df.format(range));
        } else {
            setAverageConsumption(getAverageConsumption() + consumptionWithPackage());
            double range = (getTankCapacity() / getAverageConsumption()) * 100;
            return Double.parseDouble(df.format(range));
        }
    }

    private double consumptionWithPackage() {
        double consumptionWithPackage = 0;
        if (packageWeight > 0) {
            consumptionWithPackage = 0.5 * (packageWeight / 100);
            return consumptionWithPackage;
        }
        return consumptionWithPackage;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
