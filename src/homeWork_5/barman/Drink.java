package homeWork_5.barman;

public class Drink {

    private String name;
    private double price;
    private boolean alcoholic;

    public Drink(String name, double price, boolean alcoholic) {
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }
}
