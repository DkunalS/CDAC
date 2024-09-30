package day02_25_09_2024;

public class Car
{
    private String make;
    private String model;
    private Date purchasedate;

    public Car(String make, String model, Date purchasedate)
    {
        this.make = make;
        this.model = model;
        this.purchasedate = purchasedate;
    }

    public String toString()
    {
        return "Car Make: " + make + " \nModel: " + model + " \nPurchase Date: " + purchasedate;
    }

    public static void main(String[] args)
    {
        Car car = new Car("Ford"," Mustang",new Date(21, Months.APR, 1697));
        System.out.println(car);

    }
}
