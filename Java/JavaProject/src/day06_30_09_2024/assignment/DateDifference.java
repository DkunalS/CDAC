package day06_30_09_2024.assignment;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateDifference {
    public static void main(String[] args) {



        LocalDate dateTime1 = LocalDate.of(2020, 6, 28);

        LocalDate dateTime2 = LocalDate.of(2024, 6, 5);
        Duration date = Duration.ofDays(dateTime2.compareTo(dateTime1));
//        Duration diff = Duration.between(dateTime1, dateTime2);
//        System.out.println(date.toDaysPart());
//        System.out.println(date.getSeconds());
        // days between datetime 1 and datetime 2
//        System.out.println("Days: " + diff.toDays());

//        // hours between datetime 1 and datetime 2
//        System.out.println("Hours: " + diff.toHours());
//
//        // Minutes between datetime 1 and datetime 2
//        System.out.println("Minutes: " + diff.toMinutes());
//
//        // Seconds between datetime 1 and datetime 2
//        System.out.println("Seconds: " + diff.getSeconds());
    }
//        String date1 = "2024-01-01";
//        String date2 = "2024-09-30";
//
//        try {
//            long daysDifference = calculateDays(date1, date2);
//            System.out.println("Days between " + date1 + " and " + date2 + ": " + daysDifference);
//        } catch (ParseException e) {
//            System.out.println("Invalid date format");
//        }
//    }

//    public static long calculateDays(String date1, String date2) throws ParseException {
//        // Define the date format
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date startDate = format.parse(date1);
//        Date endDate = format.parse(date2);
//
//        // Get the calendar instances for both dates
//        Calendar startCal = Calendar.getInstance();
//        Calendar endCal = Calendar.getInstance();
//        startCal.setTime(startDate);
//        endCal.setTime(endDate);
//
//        // Calculate the difference in milliseconds
//        long diffInMillis = endCal.getTimeInMillis() - startCal.getTimeInMillis();
//
//        // Convert milliseconds to days
//        return diffInMillis / (1000 * 60 * 60 * 24);


//    }
}
