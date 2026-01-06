package chap13.section02.example02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApplication {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); // 현재 날짜+시간
        System.out.println(localDateTime);

//      TODO: 날짜 포맷 변경 방법 소개+
//        자바 언어 : 대소문자 구분
//        yyyy : 년(year)   (4자리수)
//        MM   : 월(month)  (2자리수)
//        dd   : 일(day)    (2자리수)
//        HH   : 시(hour)   (2자리수)
//        mm   : 분(minute) (2자리수)
//        ss   : 초(second) (2자리수)
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = localDateTime.format(dateTimeFormatter);

        System.out.println(str);                 // 적용된 포맷 출력
    }
}
