package day06_30_09_2024.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
    public static void main(String[] args) {
        int [] nums = {10,4,7,5,9,4,15,45,23,15,16,24,32,15,14,12,56,47,42,36,31,32,19};
        IntStream stream = Arrays.stream(nums);

        System.out.println(stream.count());
        stream = Arrays.stream(nums);
        System.out.println(stream.distinct().count());

        stream = Arrays.stream(nums);
        stream.forEach(System.out::println);

        stream = Arrays.stream(nums);
        List<Integer> squares = stream.map((n) -> n*n).boxed().collect(Collectors.toList());
        System.out.println(squares);

        stream = Arrays.stream(nums);
        List<Integer> even = stream.filter((n) -> n%2==0).boxed().collect(Collectors.toList());
        System.out.println(even);

    }
}
