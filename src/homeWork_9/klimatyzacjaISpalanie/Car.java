package homeWork_9.klimatyzacjaISpalanie;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private boolean isClimatizationOn;

    public boolean isClimatizationOn() {
        return isClimatizationOn;
    }

    public void setClimatizationOn(boolean climatizationOn) {
        isClimatizationOn = climatizationOn;
    }

    public Car(String name, double tankCapacity, double averageConsumption, boolean isClimatizationOn) {
        super(name, tankCapacity, averageConsumption);
        this.isClimatizationOn = isClimatizationOn;
    }

    @Override
    public double range() {
        if (isClimatizationOn) {
            DecimalFormat df = new DecimalFormat("#.##");
            setAverageConsumption(getAverageConsumption() + 0.8);
            double range = getTankCapacity() / getAverageConsumption() * 100;
            return Double.parseDouble(df.format(range));
        } else {
            return super.range();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
