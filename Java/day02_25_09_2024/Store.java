package day02_25_09_2024;

import java.util.Scanner;

public class Store
{
    public static void main(String[] args) {
        Flavour flavour = Flavour.CHOCOLATE;
        switch (flavour){
            case CHOCOLATE:
                System.out.println("You have selected " + flavour);
                break;
            case MINT:
                System.out.println("You have selected " + flavour);
                break;
            case CREAM:
                System.out.println("You have selected " + flavour);
                break;
        }

        System.out.println("**************MENU****************");
        Flavour []menu = Flavour.values();
        for (Flavour f : menu)
        {
            System.out.println(f);
        }
        System.out.println("Enter the Flavour: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        // To create an Enum object from String
        Flavour f = Flavour.valueOf(choice.toUpperCase());
        System.out.println("Selected flavour: " + f);
        System.out.println("Price for selected flavour : "+ f.getPrice());
    }
}
