package day04_27_09_2024.interfaces;


public class SalariedEmployee extends Employee implements Printable {

    protected double basic;
    public SalariedEmployee(int empId, String name, double basic) {
        super(empId, name);
        this.basic = basic;
        }

    @Override
    public double calculateGross() {
        return this.basic + this.basic * .4 + this.basic * .12;
    }

    public double calculateNet() {
        double gross = this.calculateGross();
        return gross - (gross * .2);
    }

    @Override
    public void print() {

    }
}
