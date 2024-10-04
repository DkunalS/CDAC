package day07_03_10_2024.assignment.toy;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.time.temporal.ChronoUnit.DAYS;

public class MyProductClass {

    public List<Toy> initializedProducts() {
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy(103, "Teddy", 1000, 3,"cotton", LocalDate.of(2020,5,3)));
        toyList.add(new Toy(101, "Puzzle", 500, 6,"education", LocalDate.of(2021,6,9)));
        toyList.add(new Toy(104, "Word Matching", 600, 7, "education", LocalDate.of(2023,4,5)));
        toyList.add(new Toy(102, "Tractor", 200, 4,"battery operated", LocalDate.of(2024,9,4)));
        toyList.add(new Toy(105, "Car", 700, 3, "battery operated", LocalDate.of(2022,1,3)));
        toyList.add(new Toy(107, "Bike", 400, 4, "battery operated", LocalDate.of(2024,2,7)));
        toyList.add(new Toy(106, "Ball", 100, 5, "rubber", LocalDate.of(2021,7,2)));
        toyList.add(new Toy(110, "Bat", 900, 8, "wood", LocalDate.of(2022,9,6)));
        return toyList;
    }
    public static void main(String[] args) {
        MyProductClass myProductClass = new MyProductClass();
        List<Toy> toyList = myProductClass.initializedProducts();

        System.out.println("--------------------List the Stock-------------------------------");
        Stream<Toy> toyStream = toyList.stream();
        toyStream.forEach(System.out::println);

        System.out.println("\n-----------------Filter the Stock by Category------------------");
        toyStream = toyList.stream();
        toyStream.filter((toy) -> toy.getCategory().contains("education")).forEach(System.out::println);

        System.out.println("\n--------------------List Toy by Price Range-------------------");
        toyStream = toyList.stream();
        Predicate<Toy> priceRange = (toy) -> (toy.getPrice() > 500 && toy.getPrice() < 1000);
        toyStream.filter(priceRange).forEach(System.out::println);


        System.out.println("\n--------------Sorting by toy by price - category-----------");
        toyStream = toyList.stream();
        Comparator<Toy> priceCategory = Comparator.comparing(Toy::getCategory).thenComparing(Toy::getPrice);
        toyStream.sorted(priceCategory).forEach(System.out::println);

        System.out.println("\n--------------------List of old Products----------------------");
        toyStream = toyList.stream();
        toyStream.filter((toy) -> (DAYS.between(toy.getDate(), LocalDate.now()) > 365)).forEach(System.out::println);

        System.out.println("\n-----------Group by Category and Counting------------");
        toyStream = toyList.stream();
        Map<String,List<Toy>> toyByCategory = toyStream.collect(Collectors.groupingBy(Toy::getCategory));
        toyByCategory.forEach((key, value) -> System.out.println(key + " : " + value.size()));

        System.out.println("\n-------Most Expensive/Least Expensive in the given category-----");
        System.out.println("\n----------------------Most Expensive----------------------------");
        toyStream = toyList.stream();
        Comparator<Toy> price = Comparator.comparing(Toy::getPrice);
        Optional<Toy> toyMaxPrice = toyStream.filter(toy -> toy.getCategory().contains("education")).
                collect(Collectors.maxBy(price));
        toyMaxPrice.ifPresent(System.out::println);

        System.out.println("\n----------------------Least Expensive----------------------------");
        toyStream = toyList.stream();
        Optional<Toy> minPriceToy = toyStream.filter(toy -> toy.getCategory().contains("education")).
                collect(Collectors.minBy(price));
        minPriceToy.ifPresent(System.out::println);

        System.out.println("\n------------Total no of toy in each age group-------------");
        toyStream = toyList.stream();
        Map<Integer,List<Toy>> ageGoupingCategory = toyStream.collect(Collectors.groupingBy(Toy::getAge));
        ageGoupingCategory.forEach((key, value) -> System.out.println("For " + key + " years of Children  - Available toys  are : " +value.size()));
    }
}
