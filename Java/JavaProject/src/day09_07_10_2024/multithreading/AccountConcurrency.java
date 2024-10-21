package day09_07_10_2024.multithreading;


public class AccountConcurrency {
    public static void main(String[] args) {
        WithdrawJob withdrawJob = new WithdrawJob();
        Thread t1 = new Thread(withdrawJob);
        Thread t2 = new Thread(withdrawJob);

        t1.setName("Husband");
        t2.setName("Wife");

        t1.start();
        t2.start();

    }
}
