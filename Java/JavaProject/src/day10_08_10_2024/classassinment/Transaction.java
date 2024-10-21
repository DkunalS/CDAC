package day10_08_10_2024.classassinment;


public class Transaction {

    public static void main(String[] args) {
        Account account =  new Account(10000);
            Runnable w = () -> {
                for (int i = 0; i < 10; i++) {
                    account.withdraw(3000);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            new Thread(w).start();

        Runnable d = () -> {
            for (int i = 0; i < 10; i++) {
                account.deposit(2000);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(d).start();
    }
}
