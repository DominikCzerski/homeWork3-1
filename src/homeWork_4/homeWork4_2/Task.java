package homeWork_4.homeWork4_2;

public class Task {

    String name;
    int priority;
    Person person;

    public Task(String name, int priority, Person person) {
        this(name, priority);
        this.person = person;
    }

    public Task(String name, int priority) {
        this(name);
        this.priority = priority;
    }

    public Task(String name) {
        this.name = name;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {

        return priority < 0;
    }
}


