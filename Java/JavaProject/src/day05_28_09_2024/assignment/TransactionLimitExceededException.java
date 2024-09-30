package day05_28_09_2024.assignment;

public class TransactionLimitExceededException extends Exception
{
    public TransactionLimitExceededException(String message)
    {
        super(message);
    }
}
