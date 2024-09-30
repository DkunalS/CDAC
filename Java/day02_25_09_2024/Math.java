package day02_25_09_2024;

import day01_24_09_2024.Date;
import day01_24_09_2024.NewDate;

import java.util.Arrays;

public class Math {

    /*
    Parameter in java are passed by value: only a copy of variable data
     */

    public static int increment(int num) {

        num = num + 1;
        return num;
    }

    public static int incrementDate(NewDate d) {
        int day = d.getDay();
        d.setDay(day+1);
        return day;
    }

    public static void swapDate(Date d1, Date d2) {
        Date temp = null;
        temp = d1;
        d1 = d2;
        d2 = temp;

    }
    public static void srtArray(int [] arr)
    {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Before Increment : " + n);
        increment(n);
        System.out.printf("After Increment : " + n);

        NewDate d = new NewDate();
        d.setDay(23);
        d.setMonth("Feb");
        d.setYear(2012);

        System.out.println("Before Increment : " + d);
        incrementDate(d);
        System.out.println("After Increment : " + d);

        Date d1 = new Date(4, "Mar", 2013);
        Date d2 = new Date(5, "Apr", 2013);
        System.out.println("Before Increment d1 : " + d1 + " d2 :" + d2);
        swapDate(d1, d2);
        System.out.println("After Increment d1 : " + d1 + " d2 :" + d2);

        int arr [] = {19, 13, 11, 15};
        srtArray(arr);
        System.out.println("After Increment : " + Arrays.toString(arr) );

    }


}
