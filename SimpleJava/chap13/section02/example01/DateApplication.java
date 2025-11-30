package chap13.section02.example01;

import java.util.Calendar;
import java.util.Date;

public class DateApplication {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); // 현재 날짜

        Calendar calendar = Calendar.getInstance();
        int y = calendar.get(Calendar.YEAR);          // 현재 년
        int m = calendar.get(Calendar.MONTH) + 1;     // 현재 월
        int d = calendar.get(Calendar.DAY_OF_MONTH);  // 현재 일
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
    }
}
