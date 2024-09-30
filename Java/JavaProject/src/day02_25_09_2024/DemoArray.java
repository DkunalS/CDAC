package day02_25_09_2024;
import day01_24_09_2024.Date;
import java.lang.Math;


public class DemoArray {
    public static void main(String[] args) {
//        Array is first class object b/c of dont need to create the object
//        String is also first class oject
        int []arr = {12,13,14,15};
        for(int a : arr)
        {
            if(a%2 == 0)
            {
                System.out.printf("Number is Even");
            }
            else
            {
                System.out.println("Number is Odd");
            }

            Date[] dd = new Date[3];
            dd[0] = new Date();
            dd[0].setDate(12,"Aug",2000);
            dd[0].displayDate();

            dd[1] = new Date();
            dd[1].setDate(12,"Aug",2000);
            dd[1].displayDate();

            dd[2] = new Date();
            dd[2].setDate(12,"Aug",2000);
            dd[2].displayDate();


            for(Date d : dd)
            {
                d.displayDate();
            }
        }
    }
}