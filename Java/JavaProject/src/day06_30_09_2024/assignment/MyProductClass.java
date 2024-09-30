package day06_30_09_2024.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyProductClass {

    public static void main(String[] args) {
        Stock stock = new Stock();

        List<Toy> toyList = new ArrayList<>();

        toyList.add(new Toy(103, "Teddy", 1000, 3,"cotton", LocalDate.of(2020,5,3)));
        toyList.add(new Toy(101, "Puzzle", 500, 6,"education", LocalDate.of(2021,6,9)));
        toyList.add(new Toy(104, "Word Matching", 600, 7, "education", LocalDate.of(2023,4,5)));
        toyList.add(new Toy(102, "Tractor", 200, 4,"battery operated", LocalDate.of(2024,9,4)));
        toyList.add(new Toy(105, "Car", 700, 3, "battery operated", LocalDate.of(2022,1,3)));
        toyList.add(new Toy(107, "Bike", 400, 4, "battery operated", LocalDate.of(2024,2,7)));
        toyList.add(new Toy(106, "Ball", 100, 5, "rubber", LocalDate.of(2021,7,2)));

        System.out.println("--------------------List the Stock-------------------------------");
        stock.printList(toyList);

        System.out.println("\n-----------------Filter the Stock by Category------------------");
        List <Toy> filterToy = stock.filterCategory(toyList, "battery operated");
        stock.printList(filterToy);

        System.out.println("\n----------------------Sorting by ProdId------------------------");
        Collections.sort(toyList);
        stock.printList(toyList);

        System.out.println("\n-------------------Binary Search by ProdId--------------------");
        int index = Collections.binarySearch(toyList, new Toy(101, "Puzzle", 200, 6, "education", LocalDate.of(2021,5,2)));
        System.out.println(toyList.get(index));

        System.out.println("\n--------------------List Toy by Price Range-------------------");
        List <Toy> priceRangeList = stock.priceRange(toyList, 300,800);
        stock.printList(priceRangeList);

        System.out.println("\n-----------------List Toy for a specific age------------------");
        List <Toy> ageSpecificList = stock.SpecificAge(toyList, 6);
        stock.printList(ageSpecificList);

        System.out.println("\n-----------------------Sorting by Name------------------------");
        toyList.sort(new NameComparator());
        stock.printList(toyList);

        System.out.println("\n----------------------Sorting by Price------------------------");
        toyList.sort(new PriceComparator());
        stock.printList(toyList);

        System.out.println("\n--------------------List of old Products----------------------");
        List <Toy> oldProductList = stock.olderProduct(toyList, 365);
        stock.printList(oldProductList);
    }
}
