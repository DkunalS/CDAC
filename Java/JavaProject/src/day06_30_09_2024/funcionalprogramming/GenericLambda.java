package day06_30_09_2024.funcionalprogramming;

public class GenericLambda {
    public static <T> T operationOnData(Function<T> func, T data ) {
        return func.apply(data);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "omkar");
        String subString = operationOnData((s) -> s.substring(3), "Omkar eda hai");
        System.out.println(subString);

        Integer square = operationOnData((s) -> s*s, 24);
        System.out.println(square);

//        Employee employee1 = operationOnData((emp) -> new Employee(employee.getEmpId()+1, "omkar"), "omkar eda hai");
    }

}
