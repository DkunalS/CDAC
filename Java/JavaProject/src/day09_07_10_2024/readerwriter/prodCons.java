package day09_07_10_2024.readerwriter;

public class prodCons
{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
