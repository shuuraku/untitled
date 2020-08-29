package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) throws ParseException {
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