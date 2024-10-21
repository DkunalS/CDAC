package day01_24_09_2024;

public class Date {
    private int day;
    private String month;
    private int year;

    public Date()
    {

    }

    public Date(int d, String m, int y){
        day = d;
        month = m;
        year = y;
    }

    public void setDate(int d, String m, int y){
        day = d;
        month = m;
        year = y;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void displayDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

}

