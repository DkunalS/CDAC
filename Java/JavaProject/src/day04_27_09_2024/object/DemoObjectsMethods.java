package day04_27_09_2024.object;

public class DemoObjectsMethods
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Car car1 = new Car("BMW","Mustang",80000);
        Car car2 = new Car("BMW","Mustang",80000);

        System.out.println(car1.equals(car2));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        Car car3 = (Car)car1.clone();
        car1.setPrice(100000);
        car1.setModel("WWW");
        System.out.println(car3);


    }
}
