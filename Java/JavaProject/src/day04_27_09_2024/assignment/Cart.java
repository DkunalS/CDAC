package day04_27_09_2024.assignment;

public class Cart
{
    private double total = 0;

    public void addToCart(Dessert dessert)
    {
        double price = dessert.calculatePrice();
        total += price;
        System.out.println("Your item added to the cart!");
    }

    public double displayAmount()
    {
//        System.out.println("Total amount is : "+total+" RS/-");
        return total;
    }
}
