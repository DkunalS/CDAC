package day06_30_09_2024.funcionalprogramming;

public class StringLambda {

    public static String operationOnString(StringOperation stringOperation, String string)
    {
        return stringOperation.apply(string);
    }

    public String reverse (String string)
    {
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        StringLambda stringLambda = new StringLambda();

        /* String Manipulate*/
        /* Convert String to uppercase and reverse a string*/
        String text = "asdfghjklzxcvbnm";
        String upperCaseString = stringLambda.operationOnString((string) -> string.toUpperCase(), text);
            System.out.println(upperCaseString);

        String reverseString = stringLambda.operationOnString((string) -> {
            String reversedString = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                reversedString += string.charAt(i);
            }
            return reversedString;
        }, text);
        System.out.println(reverseString);
        /*
        Method reference:
        for static methods use classname::methodname
        for instancemethod use obj::methodname
         */

        String upperCaseString1 = operationOnString(String::toUpperCase, text);
        System.out.println(upperCaseString1);
        String reverseString1 = operationOnString(stringLambda::reverse,text);
        System.out.println(reverseString1);
    }


}


