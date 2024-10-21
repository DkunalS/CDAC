package day09_07_10_2024.multithreading;

public class Account {
    private double balance;
    public Account(double balance) {
        super();
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
