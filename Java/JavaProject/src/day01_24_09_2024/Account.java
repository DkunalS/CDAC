package day01_24_09_2024;

public class Account {
    private int accId;
    private String name;
    private static float interestRate;

    static
    {
        System.out.println("Static block 1");
        interestRate = 5.2f;
    }

    static
    {
        System.out.println("Static block 2");
    }


    // Parameterized constructor
    // Here we are overloading the constructor
    public Account(int accId, String name) {
        this.accId = accId;
        this.name = name;
    }

    public static void displayInterestRate(){
        System.out.println("Current Interest Rate: " + interestRate);
    }
}
