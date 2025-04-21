package chap13.section02.example02;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateApplication {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); // 현재 날짜
        System.out.println(localDate);         // 현재 날짜

        LocalTime localTime = LocalTime.now();  // 현재 시간
        System.out.println(localTime);          // 현재 시간
    }
}