package day09_07_10_2024.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingParsing {

    public static void main(String[] args) {
        LocalDateTime dt =  LocalDateTime.of(2024, 12,12,8,23,40);
        System.out.println(dt);

        String date = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
        System.out.println(date);

        date = dt.format(DateTimeFormatter.ofPattern("E-MM-yy HH:mm:ss"));
        System.out.println(date);

//        pattern should be in yyyy/MM/dd HH:mm:ss format during the parsing
        String myDate = "2024/12/12 04:23:40";

        LocalDateTime mydt = LocalDateTime.parse(myDate, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(mydt);
    }
}
