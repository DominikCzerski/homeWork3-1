package homeWork_12.bazaProduktowWPliku;

public class ProductTest {

    public static void main(String[] args) {
        Product product = new Product("Pensil", "BIC", 12.23);
        Product product2 = new Product("Fan", "WindIsAwsome", 15.23);
        Product product3 = new Product("Pillow", "HomeAndYou", 20.23);
        Product[] products = {product, product2, product3};
        FileModify.add("src/homeWork_12/bazaProduktowWPliku/test.csv", products);

    }
}
