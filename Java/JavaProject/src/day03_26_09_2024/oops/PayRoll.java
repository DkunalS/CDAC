package day03_26_09_2024.oops;


public class PayRoll
{
    public void displayGross(Employee e)
    {
        System.out.println("Gross Salary : "+e.calculateGross());
    }
    public void displayNet(SalariedEmployee e)
    {
        System.out.println("Net Salary : "+e.calculateNet());
    }
}

