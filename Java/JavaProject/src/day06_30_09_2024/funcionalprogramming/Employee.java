package day06_30_09_2024.funcionalprogramming;

public class Employee {
     //protected because we
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public abstract double calculateGross();

    public String toString()
    {
        return "Employee: " +empId + " Name"  + name;
    }

}
