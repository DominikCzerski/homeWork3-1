public class LaptopTest {

    public static void main(String[] args) {
        Laptop apple = new Laptop("Apple CO", "white", 5);

        System.out.println("I have laptop made by " + apple.producentName + " in " + apple.colour + " colour." + "\n"
                + "The size of the laptop is " + apple.size
        );

        Laptop lenovo = new Laptop("Lenovo", "black", 7);

        System.out.println("I have laptop made by " + lenovo.producentName + " in " + lenovo.colour + " colour." + "\n"
                + "The size of the laptop is " + lenovo.size
        );
    }
}