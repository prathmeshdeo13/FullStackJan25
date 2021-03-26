package Java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);
        System.out.println(System.currentTimeMillis());

        LocalDate localDate = LocalDate.now().minusDays(3);
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate2 = LocalDate.now().plusDays(8);
        System.out.println(localDate2);
        System.out.println(localDate2.getMonth());
        System.out.println(localDate2.isAfter(localDate1));

        ZoneId zoneId =ZoneId.of("Australia/Sydney");
        System.out.println(zoneId);

        LocalDate localDate3 = LocalDate.now(zoneId);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localDate3);
        System.out.println(localTime);
        LocalDate localDate4 = LocalDate.ofYearDay(2020,19);
        System.out.println(localDate4);
        LocalDate localDate5 = LocalDate.of(2020,03,19);
        System.out.println(localDate5);

        LocalDate localDate6 = LocalDate.now(zoneId);
        System.out.println(localDate6);
    }
}
