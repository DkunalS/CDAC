package day09_07_10_2024.multithreading;

public class DemoThread {
    public static void main(String[] args)
    {
        Thread threadExtend = new ThreadExtend();
        threadExtend.start();

        Thread thread = new Thread(new ThreadExtend());
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread " + i);
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
