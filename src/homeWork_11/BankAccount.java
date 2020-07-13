package homeWork_11;

public class BankAccount {

    private Person person;
    private double balance;

    public BankAccount(Person person, double balance) {
        if (person == null) {
            throw new NullPointerException("Account can't be created without a person assigned to it");
        } else {
            this.person = person;
        }
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("The amount " + amount + " you wish to withdraw is to much. The actual balance is " + balance);
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return person + " bank account balance is " + balance;
    }
}
