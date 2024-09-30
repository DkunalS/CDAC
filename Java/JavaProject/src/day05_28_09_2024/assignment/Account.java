package day05_28_09_2024.assignment;

/*
For Account Class
Implement deposit and withdraw methods
Identify possible exception and create and create Custom exception classes for the same
    1.  IncorrectDenominationException for deposit
    2.  InsufficientFundException, TransactionLimitExceededException for withdraw
Display meaningful error messages
 */

import java.util.Scanner;

public class Account
{
//    public String name;
    public double balance;
    public int limitCount;

    public Account(double balance,int limitCount)
    {
//        this.name = name;
        this.balance = balance;
        this.limitCount = limitCount;
    }

    public double deposit(double amount) throws IncorrectDenominationException {
        if(amount%100!=0)
        {
            throw new IncorrectDenominationException("Please Add Amount in Multiple of 100\n");
        }
        else {
            balance = balance + amount;
        }
        return balance;
    }

    public double withdraw(double amount) throws InsufficientFundException, TransactionLimitExceededException, IncorrectDenominationException {
        if(limitCount<=3)
        {
            if(amount%100 ==0)
            {
                if (amount > balance) {
                    throw new InsufficientFundException("Insufficient Fund\n");
                } else {
                    balance -= amount;
                    limitCount++;
                }
            }
            else
            {
                throw new IncorrectDenominationException("Please Enter The Amount in Multiple of 100\n");
            }
        }
        else
            throw new TransactionLimitExceededException("Day Limit Exceeded!\n");

        return balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public static void main(String[] args){
        Account ac = new Account(5000, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== Welcome to STATE BANK OF CDAC ===========");
        while(true)
        {
            System.out.println("\nPress 1 -> Deposit Amount\n" +
                    "Press 2 -> Withdraw Amount\n" +
                    "Press 3 -> Check Balance\n" +
                    "Press 4 -> Exit");
            int choice = sc.nextInt();
            double amount;
            double balance;
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter Amount For Deposit: ");
                        amount = sc.nextDouble();
                        balance = ac.deposit(amount);
                        System.out.println("Your Balance is: " + balance+"\n");
                        break;
                    case 2:
                        System.out.println("Enter Amount For Withdraw: ");
                        amount = sc.nextDouble();
                        balance = ac.withdraw(amount);
                        System.out.println("Your Balance is: " + balance+"\n");
                        break;
                    case 3:
                        System.out.println("Your Balance is: " + ac.getBalance()+"\n");
                        break;
                    case 4:
                        System.out.println("\nThank You! \nExited Successfully! \nVisit Again!!");
                        System.exit(0);
                }
            } catch (InsufficientFundException | TransactionLimitExceededException | IncorrectDenominationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
