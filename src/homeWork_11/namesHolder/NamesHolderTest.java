package homeWork_11.namesHolder;

public class NamesHolderTest {

    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder(3);
        namesHolder.add("Dominik");
        namesHolder.add("Test");
        namesHolder.add("car");
        System.out.println(namesHolder.size());
        System.out.println(namesHolder.contains("Dominik"));
        System.out.println(namesHolder.contains("Car"));

    }
}
