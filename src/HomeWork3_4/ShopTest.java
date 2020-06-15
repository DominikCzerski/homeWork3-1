package HomeWork3_4;

public class ShopTest {

    public static void main(String[] args) {
        Category sweets = new Category("Sweets", "Sweets from around the world");
        Product marshmallow = new Product("Marshmallow", 12.32, "spongy and white candy", sweets);
        Product bubbleGum = new Product("Bubble gum", 14.45, "sweet and sour gum", sweets);

        Category meat = new Category("meat", "meat from around the world");
        Product pork = new Product("pork", 56.34, "best pork in town", meat);

        Product milkCandy = new Product("Milk candy", 16.42, "Chocolate treat");

        SpecialOffer specialOffer = new SpecialOffer(pork, "really good deal", "from Monday to Tuesday", 0.20);

        System.out.println("First product name is " + marshmallow.name + " it is a " + marshmallow.description + " and costs " + marshmallow.price + ". " + "\n"
                + "You can find it in " + marshmallow.category.name + " category"
        );

        System.out.println("Second product name is " + bubbleGum.name + " it is a " + bubbleGum.description + " and costs " + bubbleGum.price + ". " + "\n"
                + "You can find it in " + bubbleGum.category.name + " category"
        );

        System.out.println("Third product name is " + milkCandy.name + " it is a " + milkCandy.description + " and costs " + milkCandy.price + ". ");

        System.out.println("Fourth product name is " + pork.name + " it is the " + pork.description + " and costs " + pork.price + ". " + "\n"
                + "You can find it in " + pork.category.name + " category. You can get this " + specialOffer.description + " " + specialOffer.promoTime + ". The discount is for" + "\n" +
                specialOffer.promoValue * 100 + "% of the initial price."
        );


    }
}
