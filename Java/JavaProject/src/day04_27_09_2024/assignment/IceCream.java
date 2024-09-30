package day04_27_09_2024.assignment;

public class IceCream extends Dessert
{
    private static final double PRICE_PER_PIECE = 35;

    public IceCream(String flavour, double quantity) {
        super(flavour, quantity);
    }

    @Override
    public double calculatePrice() {
        return quantity * PRICE_PER_PIECE;
    }
}
