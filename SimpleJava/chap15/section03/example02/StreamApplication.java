package chap15.section03.example02;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("B");
//      TODO: 2) map 사용 : 데이터 가공
//        예제: 배열의 값을 대문자로 바꾸어서 출력하기
//            (jquery)함수체이닝 : 객체변수.함수().함수().함수()
//         사용법 : 1) 정의부       : list.stream()
//                 2) 가공        : .map(s-> s.toUpperCase())
//                 3) 결과내보내기 : .collect(Collectors.toList());

//      에제 1) 대문자로 바꾸어서 출력하기
        List<String> list2 = list.stream()
                .map(s-> s.toUpperCase())
                .collect(Collectors.toList());

        list2.forEach(s-> System.out.println(s)); // 대문자 배열 출력
    }
}
