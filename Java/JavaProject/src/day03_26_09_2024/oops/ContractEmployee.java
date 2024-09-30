package day03_26_09_2024.oops;

public class ContractEmployee extends Employee {

    protected double renumeration;
    protected double hours;
    public ContractEmployee(int empId, String name, double renumeration, double hours) {
        super(empId, name);
        this.renumeration = renumeration;
        this.hours = hours;
    }

    @Override
    public double calculateGross() {
        return renumeration * hours;
    }

}
