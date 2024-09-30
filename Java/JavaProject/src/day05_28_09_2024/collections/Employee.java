package day05_28_09_2024.collections;

import java.util.Set;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String name;
    private double salary;
    private Set<String> skillSet;

    public Employee(int empId, String name, double salary, Set<String> skillSet) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.skillSet = skillSet;
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

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skillSet=" + skillSet +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.getEmpId();
    }
}
