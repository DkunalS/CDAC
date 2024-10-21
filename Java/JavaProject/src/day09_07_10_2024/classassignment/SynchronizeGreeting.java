package day09_07_10_2024.classassignment;

public class SynchronizeGreeting {
    public static void main(String[] args) {
        char [] greet = {'G','o','o','d',' ','M','o','r','n','i','n','g'};
         PrintChar p = new PrintChar(greet);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printChars();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printChars();
            }
        });

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
