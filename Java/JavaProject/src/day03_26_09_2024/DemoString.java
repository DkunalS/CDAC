package day03_26_09_2024;

public class DemoString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s3 = "Hello";
        String s2 = "World";
        String s4 = "world";

        String n1 = new String("Hello");
        String n2 = new String("Hello");
        // if
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        s1 = s1 + s2;
        System.out.println(s1);
        String s5 = s1.concat(s2);
        System.out.println(s5);

        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));



        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s2.compareTo(s4));
        System.out.println(s2.compareToIgnoreCase(s4));
        System.out.println(s1.compareTo(s2));

    }


}
