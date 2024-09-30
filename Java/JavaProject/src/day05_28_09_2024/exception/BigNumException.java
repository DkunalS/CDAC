package day05_28_09_2024.exception;

import java.util.Scanner;

public class BigNumException {

    public static void checkBigNum(int num) throws Exception {
        if (num > 60000)
        {
            throw new Exception("Number should be less than 60000");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        try {
            checkBigNum(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
