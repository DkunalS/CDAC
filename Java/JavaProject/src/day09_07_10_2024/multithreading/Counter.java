package day09_07_10_2024.multithreading;

public class Counter {
    int count = 0;

//    public void increment()
    public synchronized void increment()
    {
        count++;
    }
    public int getCount()
    {
        return count;
    }
}
