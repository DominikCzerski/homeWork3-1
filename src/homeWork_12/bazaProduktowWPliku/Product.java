package homeWork_12.bazaProduktowWPliku;

public class Product {

    private String name;
    private String producent;
    private double price;

    public Product(String name, String producent, double price) {
        this.name = name;
        this.producent = producent;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProducent() {
        return producent;
    }

    public double getPrice() {
        return price;
    }



    public String information() {
        return name + ";" + producent + ";" + price;
    }
}
