package day03_26_09_2024.oops;

public abstract class Employee {
     //protected because we
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;

        this.name = name;
    }

    public abstract double calculateGross();

    public String toString()
    {
        return "Employee: " +empId + " Name"  + name;
    }

}
