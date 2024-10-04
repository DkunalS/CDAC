package assignment.toy;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.temporal.ChronoUnit.DAYS;

public class StoreClass {

    public List<Toy> initializedToy() {
        List<Toy> toyList = new ArrayList<>();

        toyList.add(new Toy(105, "panda", 700, 3, "battery operated", LocalDate.of(2021,1,3)));
        toyList.add(new Toy(101, "pooh", 1000, 3,"cotton", LocalDate.of(2021,5,3)));
        toyList.add(new Toy(103, "crossword", 600, 7, "education", LocalDate.of(2023,4,5)));
        toyList.add(new Toy(104, "monkey", 200, 4,"battery operated", LocalDate.of(2024,9,4)));
        toyList.add(new Toy(107, "doll", 100, 5, "rubber", LocalDate.of(2022,7,2)));
        toyList.add(new Toy(102, "painting", 500, 6,"education", LocalDate.of(2022,6,9)));
        toyList.add(new Toy(106, "music", 400, 4, "battery operated", LocalDate.of(2024,3,7)));
        return toyList;
    }
    public static void main(String[] args) {
        StoreClass store = new StoreClass();
        List<Toy> toyList = store.initializedToy();

        Stream<Toy> toyStream = toyList.stream();
        System.out.println("List Stock");
        toyStream.forEach(System.out::println);

        System.out.println("\nFilter Stock by Category");
        toyStream = toyList.stream();
        toyStream.filter((toy) -> toy.getCategory().contains("battery operated")).forEach(System.out::println);

        System.out.println("\nList Toy by Price");
        toyStream = toyList.stream();
        Predicate<Toy> price = (toy) -> (toy.getPrice() > 400 && toy.getPrice() < 900);
        toyStream.filter(price).forEach(System.out::println);


        System.out.println("\nSorting toy by price and category");
        toyStream = toyList.stream();
        Comparator<Toy> priceAndCategory = Comparator.comparing(Toy::getCategory).thenComparing(Toy::getPrice);
        toyStream.sorted(priceAndCategory).forEach(System.out::println);

        System.out.println("\nList of old Products");
        toyStream = toyList.stream();
        toyStream.filter((toy) -> (DAYS.between(toy.getDate(), LocalDate.now()) > 365)).forEach(System.out::println);

        System.out.println("\nGroup by Category and Counting");
        toyStream = toyList.stream();
        Map<String,List<Toy>> byCategory = toyStream.collect(Collectors.groupingBy(Toy::getCategory));
        byCategory.forEach((category, value) -> System.out.println(category + " : " + value.size()));

        System.out.println("\nMost Expensive");
        toyStream = toyList.stream();
        Optional<Toy> maxPrice = toyStream.filter(toy -> toy.getCategory().contains("rubber")).collect(Collectors.maxBy(Comparator.comparing(Toy::getPrice)));
        maxPrice.ifPresent(System.out::println);

        System.out.println("\nLeast Expensive");
        toyStream = toyList.stream();
        Optional<Toy> minPrice = toyStream.filter(toy -> toy.getCategory().contains("cotton")).collect(Collectors.minBy(Comparator.comparing(Toy::getPrice)));
        minPrice.ifPresent(System.out::println);

        System.out.println("\nTotal no of toy in each age group");
        toyStream = toyList.stream();
        Map<Integer,List<Toy>> ageCategory = toyStream.collect(Collectors.groupingBy(Toy::getAge));
        ageCategory.forEach((category, value) -> System.out.println(category + " years toys  are : " +value.size()));
    }
}
