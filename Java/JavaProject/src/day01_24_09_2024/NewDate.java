package day01_24_09_2024;

public class NewDate {
    private int year;
    private String month;
    private int day;

    public void setDay(int day) {
        if (0 < day && day < 31)
            System.out.println("Invalid Input");
        else
            this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}