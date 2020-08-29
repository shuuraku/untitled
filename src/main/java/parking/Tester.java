package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) throws ParseException {
        //java8
        Instant instant = Instant.now();
        System.out.println(instant+"\n");
        //Local
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(local)+"\n");
        System.out.println(local.plus(Duration.ofHours(3)));
        System.out.println(formatter.format(local.plus(Duration.ofHours(3)))+"\n");
        LocalDateTime other
                = LocalDateTime.of(2020,12,19,12,19);
        System.out.println(other);
        System.out.println(formatter.format(other));
//        java();
    }

    private static void java() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date)+"\n");
        String s = "2022/12/19 01:01:01";
        System.out.println(s);
        Date other = sdf.parse(s);
        System.out.println(other + "\n");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,11);
        System.out.println(calendar.getTime());
        calendar.add(calendar.DAY_OF_YEAR,10);
        System.out.println(calendar.getTime());
    }
}