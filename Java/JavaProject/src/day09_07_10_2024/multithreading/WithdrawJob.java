package day09_07_10_2024.multithreading;

import static java.lang.Thread.currentThread;

public class WithdrawJob implements Runnable {
    Account account = new Account(8000);

    public synchronized void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            System.out.println(currentThread().getName() + " is ready to withdraw");
            System.out.println(currentThread().getName() + " is sleeping");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(currentThread().getName() + " wakes up ");
            account.withdraw(amount);
            System.out.println(currentThread().getName() + " withdraw successfully");
            System.out.println("Balance: " + account.getBalance());
        } else
            System.out.println(currentThread().getName() + " doesn't have enough balance");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
        withdraw(2000);
        }

    }
}