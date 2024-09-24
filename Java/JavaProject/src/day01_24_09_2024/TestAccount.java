package day01_24_09_2024;

public class TestAccount {
    public static void main(String[] args) {
        // if only parameterized constructor is provided
        // The JVM will not provide default constructor
        Account acc1 = new Account(546545," uhdhdjhgu");
        Account.displayInterestRate();

    }
}
