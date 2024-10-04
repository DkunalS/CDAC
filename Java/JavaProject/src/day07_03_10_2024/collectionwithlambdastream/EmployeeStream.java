package day07_03_10_2024.collectionwithlambdastream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
    public List<Employee> initializedEmployees() {
        List<Employee> empllist = new ArrayList<>();
        Set<String> skills = new TreeSet<>();
        skills.add("Java");
        skills.add("Python");
        empllist.add(new Employee(105, "Omkar", 85000, skills, "IT"));
        Set <String> skills1 = new TreeSet<>();
        skills1.add("Java");
        skills1.add("C++");
        empllist.add(new Employee(102, "Daksh", 95000, skills1, "IT"));
        Set <String> skills2 = new TreeSet<>();
        skills2.add("Python");
        skills2.add("C++");
        empllist.add(new Employee(104, "Ram", 65000, skills2,"Admin"));
        Set <String> skills3 = new TreeSet<>();
        skills3.add("JavaScript");
        skills3.add("C");
        empllist.add(new Employee(103, "Dhruv", 80000, skills3, "Admin"));
        Set <String> skills4 = new TreeSet<>();
        skills4.add("Java");
        skills4.add("C#");
        empllist.add(new Employee(101, "Omen", 75000, skills4,"HR"));
        return empllist;
    }

    public static void main(String[] args) {
        EmployeeStream employee = new EmployeeStream();
        List<Employee> empList = employee.initializedEmployees();
        Stream<Employee> empStream = empList.stream();


        System.out.println("-----------Sorting by Name------------");
        Comparator<Employee> byName = Comparator.comparing(Employee::getSalary);
        empStream.sorted(byName).forEach(System.out::println);


        System.out.println("--------------Sorting by Name for dept-----------");
        empStream = empList.stream();
        Comparator<Employee> byDept = Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName);
        empStream.sorted(byDept).forEach(System.out::println);


        System.out.println("------------Filter by Salary Range----------------");
        empStream = empList.stream();
        Predicate<Employee> salRange = (emp) -> (emp.getSalary() > 50000 && emp.getSalary() < 75000);
        empStream.filter(salRange).forEach(System.out::println);

        System.out.println("---------Filter by Skills--------------");
        empStream = empList.stream();
        empStream.filter((emp) -> emp.getSkillSet().contains("Java")).forEach(System.out::println);

        System.out.println("-----------Group by Department------------");
        empStream = empList.stream();
        Map<String,List<Employee>> empByDept = empStream.collect(Collectors.groupingBy(Employee::getDepartment));
        empByDept.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("----------");
        empStream = empList.stream();
        empStream.map((emp) -> new Department(emp.getEmpId(), emp.getDepartment()));

        System.out.println("--------------------");
        empStream = empList.stream();
        double totalSal = empStream.mapToDouble(Employee::getSalary).reduce(0,(e1,e2) -> e1+e2);
        System.out.println("Total salary: " + totalSal);
    }
}
