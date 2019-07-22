package Java8Basics.NewDateTime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Java8Zoned {

    public static void main(String args[]) {
        Java8Zoned java8tester = new Java8Zoned();
        java8tester.testZonedDateTime();
    }

    public void testZonedDateTime() {
        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        ZonedDateTime date2 = ZonedDateTime.parse("2019-06-26T10:15:30+05:30[Africa/Harare]");
        System.out.println("date1: " + date1);
        System.out.println("date1: " + date2);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}