package day01_24_09_2024;

public class Calender
{

    public static void main(String[] args) {
        NewDate nd = new NewDate();
        nd.setYear(2017);
        nd.setMonth("Jan");
        nd.setDay(31);

        System.out.println(nd);
        System.out.println("New Date is: " + nd.toString());
        System.out.println("New Date is: " + nd.getDay() + "/" + nd.getMonth() + "/" + nd.getYear());

    }
}
