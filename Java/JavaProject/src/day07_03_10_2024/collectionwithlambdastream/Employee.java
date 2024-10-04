package day07_03_10_2024.collectionwithlambdastream;
import java.util.Set;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private Set<String> skillSet;
    private String department;

    public Employee(int empId, String name, double salary, Set<String> skillSet, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.skillSet = skillSet;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Set<String> skillSet) {
        this.skillSet = skillSet;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillSet=" + skillSet +
                ", department='" + department + '\'' +
                '}';
    }
}
