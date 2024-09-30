package day06_30_09_2024.funcionalprogramming;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda1 {
    public boolean operationOnNum(Pradicate p, int n)
    {
        return p.check(n);
    }

    public List<Integer> operationOnNum(Pradicate p, List<Integer> n)
    {
        List<Integer> filtered = new ArrayList<>();
        for(Integer i : n)
        {
            if(p.check(i))
            {
                filtered.add(i);
            }
        }
        return filtered;
    }

    public String operationOnString(StringOperation stringOperation, String string)
    {
        return stringOperation.apply(string);
    }


    public static void main(String[] args) {
        Integer [] nums = {110,-1200,-300,500,-600,700};
        List<Integer> numList = Arrays.asList(nums);
        DemoLambda1 demoLambda1 = new DemoLambda1();
        boolean isPositive = demoLambda1.operationOnNum((n) -> n>0, 12);
        System.out.println(isPositive);

        List<Integer> positiveNumList = demoLambda1.operationOnNum((n) -> n>0, numList);
        System.out.println(positiveNumList);

//        List<Integer> divisibleBy100 = demoLambda1.operationOnNum((n) -> n%100 == 0, numList);
        List<Integer> divisibleBy100 = demoLambda1.operationOnNum((n) -> n%100 == 0, Arrays.asList(100,900,456,478,156,300,400));
        System.out.println(divisibleBy100);

        /* String Manipulate*/
        /* Convert String to uppercase and reverse a string*/
        String text = "asdfghjklzxcvbnm";
        String upperCaseString = demoLambda1.operationOnString((string) -> string.toUpperCase(), text);
        System.out.println(upperCaseString);

        String reverseString = demoLambda1.operationOnString((string) -> {
            String reversedString = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                reversedString += string.charAt(i);
            }
            return reversedString;
        }, text);
        System.out.println(reverseString);
    }
}

