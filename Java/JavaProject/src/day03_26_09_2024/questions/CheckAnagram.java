package day03_26_09_2024.questions;

public class CheckAnagram
{
    public void check(String s1)
    {
        int length = s1.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        if(length%2 == 0)
        {
            int len = length/2;
            for (int i =0 ; i < len; i++)
            {
                sb.append(s1.charAt(i));
//                System.out.println(s1.charAt(i));
            }
            System.out.println(sb.toString());

            for(int j = len; j < length-1 ; j++)
            {
                sb1.append(s1.charAt(j));
//                System.out.println(sb1.toString());
//                System.out.println(s1.charAt(j));
            }
//            System.out.println(sb1.);

            System.out.println(sb1.toString());
            sb1.reverse();
            if(sb.toString().equals(sb1.toString()))
            {
                System.out.println("Pallidrome");
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "abcdefedcba";
        String s2 = "abcdeedcba";
        CheckAnagram ca = new CheckAnagram();
        ca.check(s2);


    }

}
