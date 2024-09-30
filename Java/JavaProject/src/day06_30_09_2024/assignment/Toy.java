package day06_30_09_2024.assignment;
/*
For a Toy manufacturing company, create an app to perform basic operation on the stock

The Toy data has
    product id
    name
    price
    category
    age [to present age appropriate toys]
    purchase month, year

1. List the Stock
2. Filter the stock by category [e.g; Educational / Battery operated etc]
3. Search toy in the list by using BinarySearch (with prodid as a key)
4. List toys by price range
5. List toys for a specific age
6. Sort the toys by price, name, prodid
7. Make the list of old stock [older than 1 year]
8. Make a group of toys as per their category
 */

import java.time.LocalDate;
import java.util.Date;

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
                ", category=" + category;
    }

    @Override
    public int compareTo(Toy o) {
        return this.prodId - o.prodId;
    }
}
