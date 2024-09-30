package day02_25_09_2024;

public class Date
{
    Months months;
    int day;
    int year;

    public Date(int day, Months months, int year)
    {
        this.months = months;
        this.day = day;
        this.year = year;
    }

    public void displayDate()
    {
        System.out.println("Date is :"+day+"/"+months+"/"+year);
    }
    public String toString()
    {
        return day+"/"+months+"/"+year;
    }
    public static void main(String[] args) {
        Date d = new Date(12,Months.APR,2024);
        d.displayDate();
    }

}

