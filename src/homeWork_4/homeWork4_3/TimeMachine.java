package homeWork_4.homeWork4_3;

public class TimeMachine {

    Person person;

    public TimeMachine(Person person) {
        this.person = person;
    }

    void backInTime() {
        --person.age;
    }

    void timeTravel(Person person, int numberOfYears) {
        person.age += numberOfYears;
    }
}
