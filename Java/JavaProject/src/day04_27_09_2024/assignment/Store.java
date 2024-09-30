package day04_27_09_2024.assignment;

/*
Create an application for Dessert Store
The store sells candies (per kg) cookies (per dozen) and ice-creams per piece

Develop hierarchy of desserts with calculatePrice method

A cart class should have addToCart() method that will update the cart value
when user selects a particular dessert

Develop store class as menu driver application what will take input from user
1. Type of dessert                         EG:- Attributes = (flavour & price )
2. Quantity

At the end print total count and bill
*/

import java.util.Scanner;

public class Store
{
    public String flavour()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Flavour :\n" +
                "1 -> Chocolate\n" +
                "2 -> American Dryfruit\n" +
                "3 -> White Chocolate" +
                "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1: return "Chocolate";
            case 2: return "American Dryfruit";
            case 3: return "White Chocolate";
            default: return "Unknown" +
                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";
        }
    }

    public int quantity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\nPlease Enter your Quantity :");
        int quantity = Integer.parseInt(sc.nextLine());
        return quantity;
    }
    public static void main(String[] args) {
        double total = 0;

        Store store = new Store();
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> Welcome To Dessert Store <<<<<<<<<<<<<<<<");

        while (true)
        {
            System.out.println("\nPlease Select your Dessert :\n" +
                    "1 -> Sweet Candies (120/- kg)\n" +
                    "2 -> Testy Cookies (175/- dozen)\n" +
                    "3 -> Cold Ice-Creams (35/-piece)\n" +
                    "4 -> Exit\n" +
                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");

            int dessert = Integer.parseInt(sc.nextLine());
            String flavour;
            int quantity;
            switch (dessert) {
                case 1:
                    System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    System.out.println("Your Dessert is Candies\n");
                    flavour = store.flavour();
                    quantity = store.quantity();
                    System.out.println("Flavour is : " + flavour);
                    Dessert dessert1 = new Candies(flavour, quantity);
                    System.out.println("-----------------------------");
                    cart.addToCart(dessert1);
                    total = cart.displayAmount();
                    System.out.println("Total amount is : " + total + " RS/-");
                    System.out.println("-----------------------------");

                    break;

                case 2:
                    System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    System.out.println("Your Dessert is Testy Cookies\n");
                    flavour = store.flavour();
                    quantity = store.quantity();
                    Dessert cookies = new Cookies(flavour, quantity);
                    System.out.println("-----------------------------");
                    cart.addToCart(cookies);
                    total = cart.displayAmount();
                    System.out.println("Total amount is : " + total + " RS/-");
                    System.out.println("-----------------------------");

                    break;

                case 3:
                    System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    System.out.println("Your Dessert is Cold Ice-Creams\n");
                    flavour = store.flavour();
                    quantity = store.quantity();
                    Dessert icecream = new IceCream(flavour, quantity);
                    System.out.println("-----------------------------");
                    cart.addToCart(icecream);
                    total = cart.displayAmount();
                    System.out.println("Total amount is : " + total + " RS/-");
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("You Exit Successfully! Visit Again..");
                    total = cart.displayAmount();
                    System.out.println("Total amount is : " + total + " RS/-");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
