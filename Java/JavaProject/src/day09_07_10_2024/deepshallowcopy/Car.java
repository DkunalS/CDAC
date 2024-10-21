package day09_07_10_2024.deepshallowcopy;


import java.time.LocalDate;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private LocalDate year;

    public Car(String brand, String model, LocalDate year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        Car car = new Car("Ford", " Mustang", LocalDate.of(2012, 4, 12));
        Car car1 = new Car("Ford", " Mustang", LocalDate.of(2012, 4, 12));
        Car car3 = car;
        System.out.println(car);
        System.out.println(car1);

        try {
            Car car2 = (Car) car.clone();
            System.out.println("Are both objects the same? " + (car == car2));
            System.out.println(car == car3);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }




    }
}