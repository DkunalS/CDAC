package day06_30_09_2024.funcionalprogramming;

public class DemoLambda {

    public static void main(String[] args) {
        Pradicate isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.check(15));

        Pradicate isPrime = (n) ->
        {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.check(15));
    }
}
