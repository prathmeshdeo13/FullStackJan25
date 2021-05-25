package Java8;

import java.time.*;
import java.time.chrono.Era;
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
        Era era = LocalDate.of(2021, Month.APRIL,20).getEra();
        System.out.println(era);

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

        LocalDate localDate7 = LocalDate.now(zoneId);
        System.out.println(localDate7);

        LocalDate from= LocalDate.of(2020,8,15);
        LocalDate to = LocalDate.of(2021,3,25);

        Period period = Period.between(from,to);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        LocalDateTime localDateTime = LocalDateTime.of(2021,9,25,10,22,45);
        LocalDateTime localDateTime1 =LocalDateTime.of(2021,9,27,5,12,20);

        Duration duration = Duration.between(localDateTime,localDateTime1);
        System.out.println(duration);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());




    }
}
