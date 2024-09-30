package day06_30_09_2024.assignment;

import java.util.Comparator;

public class NameComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return (o1.getProdName().compareTo(o2.getProdName()));
    }
}
