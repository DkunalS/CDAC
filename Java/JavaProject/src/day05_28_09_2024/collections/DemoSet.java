package day05_28_09_2024.collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();  // not contains duplicate values
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(17);
        set.add(16);

        for (Integer integer : set) {
            System.out.println(integer);
        }
        set.remove(16);
        System.out.println(set.contains(17));
    }
}
