package day10_08_10_2024.classassinment;

public class Account {
    private double balance;
    private boolean isLocked = false;

    public Account(double balance) {
        super();
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        if (isLocked) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        balance = balance + amount;
        System.out.println("\n" + amount + " Rs Deposited Successfully: ");
        isLocked = true;
        notify();
    }

    public synchronized void withdraw(double amount) {
        if (!isLocked && balance < amount)
        {
            try {
            System.out.println("Insufficient Fund");
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        }
        else {
            balance = balance - amount;
            System.out.println(amount + " Withdrawal Successful!");
            isLocked = false;
            notify();
            System.out.println("Remaining Balance: " + balance);
        }
        }
    }




