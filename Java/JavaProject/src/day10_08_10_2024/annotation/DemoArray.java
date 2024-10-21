package day10_08_10_2024.annotation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray
{
    public static void main(String[] args) {
        String []arr = (String[]) Array.newInstance(String.class,3);

        Array.set(arr, 0, "Hello");
        Array.set(arr, 1, "World");
        Array.set(arr, 2, "!");

        for (int i = 0, len = Array.getLength(arr); i < len; i++)
        {
            System.out.println(Array.get(arr, i));
        }
    }
}
