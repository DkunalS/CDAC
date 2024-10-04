package day07_03_10_2024.streamoptional;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntStream
{
    public static void main(String[] args)
    {
        Integer [] nums = {10,4,7,5,9,4,15,45,23,15,16,24,32,15,14,12,56,47,42,36,31,32,19};
        List<Integer> lst = Arrays.asList(nums);
        System.out.println("---------------------");

        Stream<Integer> stream = lst.parallelStream();
        stream.map((n) -> Math.sqrt(n)).forEach(System.out::println);
        System.out.println("---------------------");

//        stream =lst.parallelStream();
//        List<Integer> primes = stream.filter(Math::isPrime).collect(Collectors.toList());
//        System.out.println(primes);
//        System.out.println("---------------------");

        stream = lst.stream();
        stream.distinct().sorted(Integer::compareTo).forEach(System.out::println);
        System.out.println("---------------------");

        stream = lst.stream();
        Optional<Integer> total = stream.reduce((n1,n2) -> n1 + n2);
        if(total.isPresent())
            System.out.println(total.get());
        System.out.println("------------    ---------");

        stream = lst.parallelStream();
        long sum = stream.reduce(1,(n1,n2) -> n1 + n2);
        System.out.println(sum);
        System.out.println("---------------------");

        stream = lst.stream();
        Optional<Integer> min = stream.reduce(Integer::compareTo);
        if(min.isPresent())
            System.out.println(min.get());
        System.out.println("---------------------");

        stream  = lst.stream();
        OptionalDouble ave = stream.mapToDouble(Double::valueOf).average();
        if(ave.isPresent())
            System.out.println(ave.getAsDouble());
        System.out.println("---------------------");




        // findAny & findAll
        stream = lst.parallelStream();
        stream.findAny().ifPresent(System.out::println);
        System.out.println("---------------------");

        Integer [] nums1 = {12,14,6,22,18,10,16,18};
        List<Integer> lst1 = Arrays.asList(nums1);
        stream = lst1.stream();
        boolean find = stream.allMatch(n -> n % 2 == 0);
        System.out.println(find);

    }
}
