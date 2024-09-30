package day05_28_09_2024.exception;

public class Math
{
    public static void main(String[] args) {
        try
        {
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            int result = dividend / divisor;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("The divisor Cannot be Zero");
            e.printStackTrace();
        }
        catch (NumberFormatException e)
        {
            System.out.println("Enter integer number only");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter 2 values as Dividend & Divisor");
            System.out.println(e.getMessage());
        }

    }
}
