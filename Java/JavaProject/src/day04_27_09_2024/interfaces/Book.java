package day04_27_09_2024.interfaces;

public class Book implements Writable, Printable
{
    private String title;
    private int price;

    public Book(String title, int price)
    {
        super();
        this.title = title;
        this.price = price;
    }

    @Override
    public void write()
    {
        System.out.println("Writing a Book");
    }
    @Override
    public void print()
    {
        System.out.println("Printing a Book");
    }

    @Override
    public void foo()
    {
        Printable.super.foo();
    }
}
