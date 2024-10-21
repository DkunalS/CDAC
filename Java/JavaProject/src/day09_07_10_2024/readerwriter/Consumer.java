package day09_07_10_2024.readerwriter;

public class Consumer implements Runnable {
    MyQueue queue;

    public Consumer(MyQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            queue.getValue();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
