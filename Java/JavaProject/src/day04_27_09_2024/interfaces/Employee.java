package day04_27_09_2024.interfaces;

public abstract class Employee implements Printable
{
    protected int employeeID;
    protected String employeeName;

    public Employee(int employeeID, String employeeName)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public abstract double calculateGross();

    public void print()
    {
        System.out.println("Employee ID: " + employeeID +"\n"+ "Employee Name: " + employeeName);
    }
}
