package day09_07_10_2024.multithreading;

public class ThreadMethods {
    public static void main(String[] args){
        Thread t1 = new ThreadExtend();
        Thread t2 = new Thread(new ThreadImplements());

        t1.setName("One");
        t2.setName("Two");

        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        for(int i = 0; i<10; i++)
        {
            System.out.println("Main Thread: " + i);
            if (i == 5)
            {
                Thread.currentThread().yield();
            }
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
