package day01_24_09_2024;

public class Overloading
{
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static float add(int a, float b)
    {
        return a+b;
    }

    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public static int addition(int a,int...num)
    {
        int res = 0;
        for(int i : num)
        {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        int result = Overloading.add(5,7);
        float result1 = Overloading.add(5,7.5f);
        int result2 = Overloading.add(5,7,8);
        int result3 = Overloading.addition(5,7,8,96,4,79,56,46);

        System.out.println("The Sum is: "+ result);
        System.out.println("The Sum is: "+ result1);
        System.out.println("The Sum is: "+ result2);
        System.out.println("The Sum is: "+ result3);

    }
}
