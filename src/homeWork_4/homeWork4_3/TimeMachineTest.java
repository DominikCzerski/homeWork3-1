package homeWork_4.homeWork4_3;

public class TimeMachineTest {


    public static void main(String[] args) {


        Person dominik = new Person("Dominik", "Kowalski", 20);
        TimeMachine timeMachine = new TimeMachine(dominik);
        timeMachine.timeTravel(dominik, 5);
        System.out.println(dominik.age); //25
        timeMachine.backInTime();
        System.out.println(dominik.age);
        timeMachine.timeTravel(dominik, 99);
        timeMachine.backInTime();
        System.out.println(dominik.age);

    }

}
