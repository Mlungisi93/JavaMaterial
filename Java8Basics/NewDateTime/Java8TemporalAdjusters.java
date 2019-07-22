package Java8Basics.NewDateTime;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Java8TemporalAdjusters {

    public static void main(String args[]) {
        Java8TemporalAdjusters java8tester = new Java8TemporalAdjusters();
        java8tester.testAdjusters();
    }

    public void testAdjusters() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the next thursday
        LocalDate nextThursday = date1.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Next Thurday on : " + nextThursday);

        //get the second saturday of next month
        LocalDate firstInThisMonth = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        System.out.println("First day of the current month: "+firstInThisMonth);
        System.out.println("Current year: "+date1.getYear()+" Month: "+date1.getMonth());
        LocalDate secondSaturday = firstInThisMonth.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }
}