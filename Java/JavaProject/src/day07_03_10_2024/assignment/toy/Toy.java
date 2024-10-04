package day07_03_10_2024.assignment.toy;

import java.time.LocalDate;

public class Toy implements Comparable<Toy>
{
    private int prodId;
    private String prodName;
    private double price;
    private int age;
    private String category;
    private LocalDate date;

    public Toy(int prodId, String prodName, double price, int age, String category, LocalDate date)
    {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.age = age;
        this.category = category;
        this.date = date;
    }

    public int getProdId() {
        return prodId;
    }

    public double getPrice() {
        return price;
    }

    public String getProdName() {
        return prodName;
    }

    public String getCategory() {
        return category;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Toy: " +
                prodName +
                ", price=" + price +
                ", age=" + age +
                ", category=" + category
                + ", date=" + date;
    }

    @Override
    public int compareTo(Toy o) {
        return this.prodId - o.prodId;
    }
}
