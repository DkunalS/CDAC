package day09_07_10_2024.multithreading;

public class DemoSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (counter) {
                    for (int i = 0; i < 50; i++) {
                        counter.increment();
                        System.out.println(Thread.currentThread().getName() + ": " + counter.getCount());
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
//                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (counter) {
                    for (int i = 0; i < 50; i++) {
                        counter.increment();
                        System.out.println(Thread.currentThread().getName() + ": " + counter.getCount());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
//                }
            }
        }).start();
    }
}
