package day05_28_09_2024.collections;

import java.util.*;

public class EmployeeCollection {
    public List<Employee> initializedEmployees() {
        List<Employee> empllist = new ArrayList<>();
        Set<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("Python");
        empllist.add(new Employee(105, "Omkar", 85000, skills));
        Set <String> skills1 = new HashSet<>();
        skills1.add("Java");
        skills1.add("C++");
        empllist.add(new Employee(102, "Daksh", 95000, skills1));
        Set <String> skills2 = new HashSet<>();
        skills2.add("Python");
        skills2.add("C++");
        empllist.add(new Employee(104, "Ram", 65000, skills2));
        Set <String> skills3 = new HashSet<>();
        skills3.add("JavaScript");
        skills3.add("C");
        empllist.add(new Employee(103, "Dhruv", 80000, skills3));
        Set <String> skills4 = new HashSet<>();
        skills4.add("Java");
        skills4.add("C#");
        empllist.add(new Employee(101, "Omen", 75000, skills4));
        return empllist;
    }

    public void printList(List<Employee> empList) {
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }
    public Employee searchEmployee(List<Employee> empList, int empId) {
        for(Employee employee : empList)
        {
            if(employee.getEmpId() == empId)
            {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> filterEmployee(List<Employee> empList, String criteria) {
        List<Employee> filteredEmployeeList = new ArrayList<>();
        for (Employee employee : empList) {
            if(employee.getSkillSet().contains(criteria))
            {
            filteredEmployeeList.add(employee);
            }
        }
        return filteredEmployeeList;
    }

    public Map<Integer,Double> salaryMap(List<Employee> empList) {
        Map<Integer,Double> salaryMap = new TreeMap<>();
        for (Employee employee : empList) {
            salaryMap.put(employee.getEmpId(), employee.getSalary());
        }
        return salaryMap;
    }

    public static void main(String[] args) {
        EmployeeCollection employeeCollection = new EmployeeCollection();

        System.out.println("-----------Creating Employee List----------------");
        List<Employee> empList = employeeCollection.initializedEmployees();
        employeeCollection.printList(empList);

        System.out.println("\n------------Searching the List------------------");
        Employee employee = employeeCollection.searchEmployee(empList, 101);
        System.out.println(employee);

        System.out.println("\n-----------Filtering the List-------------------");
        List<Employee> filterEmployee = employeeCollection.filterEmployee(empList, "Python");
        employeeCollection.printList(filterEmployee);

        System.out.println("\n------------Employee Salary Map----------------------");
        Map<Integer,Double> salaryMap = employeeCollection.salaryMap(empList);
        for (Map.Entry<Integer, Double> entry : salaryMap.entrySet()) {
            System.out.println("EmpId: " +entry.getKey() + ", Salary: " + entry.getValue());
        }

        System.out.println("\n-------------Sort the List by EmpId------------------");
        Collections.sort(empList);
        employeeCollection.printList(empList);

        System.out.println("\n-------------Binary Search on the EmpId--------------");
        int index = Collections.binarySearch(empList, new Employee(103, null,0, null));
        System.out.println("Found at the index: " + index);

        System.out.println("\n-------------Sort the List by Name-------------------");
//        Collections.sort(empList, new NameComparator()); // both are same
        empList.sort(new NameComparator());
        employeeCollection.printList(empList);

        System.out.println("\n-------------Binary Search on the Name--------------");
        index = Collections.binarySearch(empList, new Employee(0, "Omen",0, null), new NameComparator());
        System.out.println("Found at the index: " + index);

        System.out.println("\n-------------Sort the List by Salary----------------");
        Collections.sort(empList, new SalaryComparator());
        employeeCollection.printList(empList);

        System.out.println("\n-------------Binary Search on the Salary------------");
        index = Collections.binarySearch(empList, new Employee(0, null,75000, null), new SalaryComparator());
        System.out.println("Found at the index: " + index);

        System.out.println("\n-----------Employee with Minimum Salary-------------");
        System.out.println(Collections.min(empList, new SalaryComparator()));

        System.out.println("\n-----------Employee with Maximum Salary-------------");
        System.out.println(Collections.max(empList, new SalaryComparator()));

        System.out.println("\n----------Employee list in Reverse Order------------");
        Collections.reverse(empList);
        employeeCollection.printList(empList);



    }
}
