package day02_25_09_2024;

public class DemoWrapper
{
    public static void main(String[] args) {
        int i = 5;

        Integer j = Integer.valueOf(i);     // Primitive to wrapper
        System.out.println(j);

        int k = j.intValue();               // Wrapper to Primitive
        System.out.println(k);


        //Auto-Boxing
        int a = 12;
        Integer b = a;
        System.out.println(b);

        //Auto Unboxing
        int c = b;
        System.out.println(c);

        //Parsing (Only to conversion of string to another Datatype)

        int x =  Integer.parseInt("30");
        System.out.println(x);

        Integer y = Integer.valueOf("40");
        System.out.println(y);
    }
}
