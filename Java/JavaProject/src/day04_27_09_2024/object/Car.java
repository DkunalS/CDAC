package day04_27_09_2024.object;

import java.util.Objects;

public class Car implements Cloneable
{
    private String make;
    private String model;
    private int price;

    public Car(String make, String model, int price)
    {
        this.make = make;
        this.model = model;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(make, other.make) && Objects.equals(model, other.model) && price == other.price;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
