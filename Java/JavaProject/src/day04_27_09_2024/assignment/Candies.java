package day04_27_09_2024.assignment;

public class Candies extends Dessert
{
    private static final double PRICE_PER_KG = 120;

    public Candies(String flavour, double quantity) {
        super(flavour, quantity);
    }

    @Override
    public double calculatePrice() {

        return quantity * PRICE_PER_KG;
    }
}
