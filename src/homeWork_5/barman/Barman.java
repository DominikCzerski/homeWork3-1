package homeWork_5.barman;

public class Barman {

    void order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.isAlcoholic()) {
            System.out.println("Sorry we can't sell you a drink because you are underage.");
        } else {
            System.out.println(person.toString() + ", your drink " + drink.getName() + " is ready. You will have to pay " + drink.getPrice());
        }
    }


    public static void main(String[] args) {
        Person michael = new Person("Michael", "Wallack", 15);
        Drink darkBeer = new Drink("Yggdrasil", 15.00, true);

        Barman barman = new Barman();
        barman.order(michael, darkBeer);

        Person dominik = new Person("Dominik", "Yoghurt", 18);
        barman.order(dominik, darkBeer);
    }
}
