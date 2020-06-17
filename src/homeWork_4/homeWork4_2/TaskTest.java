package homeWork_4.homeWork4_2;

public class TaskTest {

    public static void main(String[] args) {
        Person dominik = new Person("Dominik");
        Task task = new Task("Taking out the trash", 1, dominik);
        Task task2 = new Task("Cleaning the dishes", 0, dominik);
        Task task3 = new Task("Walking the dog", 2, dominik);
        Task task4 = new Task("Buying new smartphone", -1, dominik);

        System.out.println("How important is the task " + task.name + "\n" +
                "highPriority " + task.highPriority() + "\n" +
                "mediumPriority " + task.mediumPriority()+ "\n" +
                "lowPriority " + task.lowPriority()
        );

        System.out.println("How important is the task " + task2.name + "\n" +
                "highPriority " + task2.highPriority() + "\n" +
                "mediumPriority " + task2.mediumPriority()+ "\n" +
                "lowPriority " + task2.lowPriority()
        );

        System.out.println("How important is the task " + task3.name + "\n" +
                "highPriority " + task3.highPriority() + "\n" +
                "mediumPriority " + task3.mediumPriority()+ "\n" +
                "lowPriority " + task3.lowPriority()
        );

        System.out.println("How important is the task " + task4.name + "\n" +
                "highPriority " + task4.highPriority() + "\n" +
                "mediumPriority " + task4.mediumPriority()+ "\n" +
                "lowPriority " + task4.lowPriority()
        );
    }
}
