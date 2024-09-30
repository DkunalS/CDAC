package day04_27_09_2024.interfaces;

public class Printer
{
    public void printData(Printable p)
    {
        p.print();
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        Book b = new Book("Alchemist",650);
        p.printData(b);

        SalariedEmployee e = new SalariedEmployee(21,"XYZ",90000);
        p.printData(e);
    }
}
