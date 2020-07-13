package homeWork_11;

public class CashMachine {

    public static void main(String[] args) {
        Person person = null;
        try {
            BankAccount bankAccount = new BankAccount(person, 1000);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        Person dominik = new Person("Dominik", "Tester");
        BankAccount bankAccount = new BankAccount(dominik, 1500);
        bankAccount.deposit(400);
        System.out.println(bankAccount.toString());
        bankAccount.withdraw(1000);
        System.out.println(bankAccount.toString());
        bankAccount.withdraw(901);


    }
}
