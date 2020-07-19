package homeWork_12.bazaProduktowWPliku;

public class ProductTest2 {

    public static void main(String[] args) {
        Product[] products = new Product[3];
        String fileName = "src/homeWork_12/bazaProduktowWPliku/test.csv";
        products = FileModify.read(fileName);

        for (Product product : products){
            System.out.println(product.information());
        }

    }
}
