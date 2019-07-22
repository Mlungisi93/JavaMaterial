package Java8Basics.NewDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class Java8ChronoUnit {

    public static void main(String args[]) {
        Java8ChronoUnit java8tester = new Java8ChronoUnit();
        java8tester.testChromoUnits();
    }

    public void testChromoUnits() {
        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        //add 1 day to the current date
        LocalDate tommorrow = today.plus(1, DAYS);
        System.out.println("Tomorrow: "+tommorrow);

        //add 1 day to the current date
        LocalDate yesterday = today.minus(1, DAYS);
        System.out.println("Yesterday: "+yesterday);

        //Subtracting dates
        LocalDate dateBefore = LocalDate.parse("2019-06-15");
        LocalDate dateAfter = LocalDate.parse("2019-06-26");
        long daysBetween = DAYS.between(dateBefore, dateAfter);
        System.out.println("Days between: "+daysBetween);

        //Another option
        LocalDate today1 = LocalDate.now();
        LocalDate after = today.plusDays(15);
        System.out.println(after);
// Duration oneDay = Duration.between(today, yesterday); // throws an exception
        System.out.println(Duration.between(today1.atStartOfDay(), after.atStartOfDay()).toDays()); // another option

        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
    }
}
