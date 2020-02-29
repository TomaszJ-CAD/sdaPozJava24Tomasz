package zajecia8;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.TimeZone;

public class Czas {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.parse("2020-02-29T08:34:27.795304400Z");
        instant1 = instant1.minus(Duration.ofDays(5));
        System.out.println(instant1);

        LocalDate today = LocalDate.now();
        System.out.println(today);


        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime meeteing = LocalTime.of(11, 30, 0);
        LocalTime meetingFinish = meeteing.plusHours(3);

 /*       LocalDateTime localDateTime = LocalDateTime.of(2020, 02, 28);
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println(dayOfYear);*/

        String[] ids = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));


        LocalDateTime myFatherBirthday = LocalDateTime.of(1955, Month.FEBRUARY, 28, 7, 55);
        LocalDateTime myBirthday = LocalDateTime.of(1985, 7, 24, 12, 15);
          Duration duration = Duration.between(myFatherBirthday,myBirthday);
        System.out.println(duration);


        long years = ChronoUnit.YEARS.between(myFatherBirthday,myBirthday);
        System.out.println(years);

        ZonedDateTime dataCzas = ZonedDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
        String tekst = dataCzas.format(f);
        System.out.println(tekst);





    }

}

