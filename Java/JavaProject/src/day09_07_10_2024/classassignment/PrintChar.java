package day09_07_10_2024.classassignment;


public class PrintChar {
    private char [] greet;
    public PrintChar(char [] greet)
    {
        super();
        this.greet = greet;
    }
    public synchronized void printChars()
    {
        System.out.println("\n"+Thread.currentThread().getName());
        for (int i = 0; i < greet.length; i++) {
            System.out.print(" " + greet[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

