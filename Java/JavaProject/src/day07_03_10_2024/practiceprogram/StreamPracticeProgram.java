package day07_03_10_2024.practiceprogram;
/*
for a list of fruits: {"Mango"
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPracticeProgram
{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of(new String[]{"Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"}));
//        ArrayList<String>

        Stream<String> fruitUpperStream = fruits.parallelStream();
        List<String> upperCase = new ArrayList<>();
        upperCase = fruitUpperStream.map((n) -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);
        System.out.println("---------------------");

        List<String> lowerCase = new ArrayList<>();
        lowerCase = fruitUpperStream.map((n) -> n.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowerCase);
        System.out.println("---------------------");

//        Stream <String> fruitStream = fruits.stream();
//        fruitStream.filter((n) -> n.length() > 3).forEach(System.out::println);
//        fruitStream.forEach(System.out::println);
//

        Stream<String> streamWithAscending = fruits.parallelStream();
//        streamWithAscending.filter((n) -> ((int)n.charAt(0)>= 97 && (int)n.charAt(0) <= 109) | ((int)n.charAt(0)>= 65 && (int)n.charAt(0) <= 77 )).forEach(System.out::println);
        streamWithAscending.filter((n) -> ((int)n.charAt(0)>= 97 && (int)n.charAt(0) <= 109) | ((int)n.charAt(0)>= 65 && (int)n.charAt(0) <= 77 )).sorted(String::compareToIgnoreCase).forEach(System.out::println);
//        streamWithAscending.filter((n) -> n.)).sorted(String::compareToIgnoreCase).forEach(System.out::println);

    }
}
