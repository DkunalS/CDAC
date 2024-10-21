package day09_07_10_2024.readerwriter;

public class MyQueue {
    private int value;
    private boolean hasValue = false;

    public synchronized void setValue(int value) {
        if (hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

        this.value = value;
        hasValue = true;
        notify();
        System.out.println("Set Value: " + value);
    }

    public synchronized void getValue() {
        if (!hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

        hasValue = false;
        notify();
        System.out.println("Get Value: " + value);
    }
}

