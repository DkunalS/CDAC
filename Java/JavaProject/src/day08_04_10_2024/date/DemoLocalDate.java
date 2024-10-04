package day08_04_10_2024.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;

public class DemoLocalDate
{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("------------------------------------");

        LocalDate diwali =LocalDate.of(2024,11,1);
        System.out.println(diwali);
        System.out.println("------------------------------------");

        Period remeaningDayForDiwali =  today.until(diwali);
        System.out.println(remeaningDayForDiwali);

        System.out.println(remeaningDayForDiwali.getYears() + " Year(s) "+remeaningDayForDiwali.getMonths()+" Month(s) "+remeaningDayForDiwali.getDays()+" Day(s)");

        long daysToDiwali = today.until(diwali, ChronoUnit.DAYS);
        System.out.println(daysToDiwali+" Day(s)");
        System.out.println("------------------------------------");


        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println("------------------------------------");



        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        LocalDate nextfiday = today.plus(7, ChronoUnit.DAYS);
        System.out.println(nextfiday);

        Stream<LocalDate> currrentyear = LocalDate.of(2024,1,1).datesUntil(LocalDate.of(2025,1,1));
        System.out.println("------------------------------------");

        currrentyear.filter((date)-> date.getDayOfWeek().equals(DayOfWeek.FRIDAY)).filter((date)-> date.getDayOfMonth() == 13).forEach(System.out::println);

        System.out.println("_________________***********************__________________");

        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());

        System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());

        System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        System.out.println(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
    }
}
