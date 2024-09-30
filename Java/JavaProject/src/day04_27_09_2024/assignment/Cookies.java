package day04_27_09_2024.assignment;

public class Cookies extends Dessert
{
    private static final double PRICE_PER_DOZEN = 175;

    public Cookies(String flavour, double quantity) {
        super(flavour, quantity);
    }


    @Override
    public double calculatePrice() {
        return quantity * PRICE_PER_DOZEN;
    }

}
