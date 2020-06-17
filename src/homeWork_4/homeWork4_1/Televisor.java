package homeWork_4.homeWork4_1;

public class Televisor {

    boolean poweredOn;

    Televisor() {
        this.poweredOn = false;
    }

    boolean turOn() {
        return poweredOn = true;
    }

    boolean turnOff() {
        return poweredOn = false;
    }

    void isTVOn() {
        System.out.println("Televisor is on " + poweredOn);
    }
}
