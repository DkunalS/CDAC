package day03_26_09_2024.oops;

public class Manager extends SalariedEmployee {
    protected double allowance;
    public Manager(int empId, String name, double basic, double allowance) {
        super(empId, name, basic);
        this.allowance = allowance;
    }

    @Override
    public double calculateGross() {
//        double hra = basic * .4;
//        double da = basic * .12;
//        return basic + hra + allowance;
        return super.calculateGross() + allowance;
    }

    public void displayAllowances()
    {
        System.out.println("Allowances : " + allowance);
    }
}
