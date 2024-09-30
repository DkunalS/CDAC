package day06_30_09_2024.assignment;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {

            if(o1.getPrice() > o2.getPrice())
                return 1;
            else if(o1.getPrice() < o2.getPrice())
                return -1;
            else return 0;
    }
}
