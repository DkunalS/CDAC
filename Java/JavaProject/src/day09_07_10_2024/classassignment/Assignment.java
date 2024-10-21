package day09_07_10_2024.classassignment;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;


public class Assignment {

    public void calculateAge()
    {
        System.out.println("-----------------Age Calculation------------------");
        LocalDate birthDate = LocalDate.of(1996,4,27);
        Period age =  birthDate.until(LocalDate.now());

        System.out.println("Your age is " + age.getYears() + " Years " + age.getMonths() + " Months " + age.getDays() + " Days ");
    }

    public void programmersDay()
    {
        System.out.println("\n------------Calculate Programmers Day-----------");
        LocalDate thisYear = LocalDate.of(2024,1,1);
        LocalDate programmersDay = thisYear.plus(255, ChronoUnit.DAYS);
        System.out.println("Programmers Day on: "+ programmersDay.getDayOfMonth()+ " " + programmersDay.getMonth() + " "+ programmersDay.getYear());
    }

    public void findAllMonthStartedOnSunday()
    {
        System.out.println("\n--------Finding Month Starts with Sunday---------");
        Stream<LocalDate> thisYear = LocalDate.of(2024,1,1).datesUntil(LocalDate.of(2025,1,1));
        thisYear.filter((date)-> date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).filter((date)-> date.getDayOfMonth() == 1).forEach(System.out::println);
    }

    public void calculateTimeDifferenceInZones()
    {
        System.out.println("\n-----Finding time difference in different time zones----");

        LocalDateTime mumbaiTime = LocalDateTime.of(2024, 10, 7, 3, 30);
        ZonedDateTime ist = mumbaiTime.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println(mumbaiTime);
        System.out.println(ist);

        LocalDateTime usaTime = LocalDateTime.of(2024,10, 6, 4,20);
        ZonedDateTime usa = usaTime.atZone(ZoneId.of("America/Los_Angeles"));
        System.out.println(usaTime);
        System.out.println(usa);

        Instant instant = ist.toInstant();
        ZonedDateTime la = instant.atZone((ZoneId.of("America/Los_Angeles")));
        System.out.println(la.toLocalDateTime());
//        Period timeDifference = ist.until(u)

    }
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        assignment.calculateAge();
        assignment.programmersDay();
        assignment.findAllMonthStartedOnSunday();
        assignment.calculateTimeDifferenceInZones();



    }
}
