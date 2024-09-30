package day02_25_09_2024;

public enum Flavour {

//    it is the neccesary to
    CHOCOLATE(120), MINT(100), CREAM(90);
    int price;

    private Flavour(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
