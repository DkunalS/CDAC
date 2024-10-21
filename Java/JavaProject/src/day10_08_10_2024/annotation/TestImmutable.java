package day10_08_10_2024.annotation;

import java.util.ArrayList;
import java.util.Date;

public class TestImmutable
{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");

        Date mdate = new Date();

        Car c = new Car("AAA","BBB",mdate,colors);
        System.out.println(c);
        colors.add("Pink");
        mdate.setDate(12);
        System.out.println(c);
        System.out.println(c.getMandate());
        System.out.println(c.getColor());
    }

}
