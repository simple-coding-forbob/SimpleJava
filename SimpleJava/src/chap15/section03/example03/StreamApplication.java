package chap15.section03.example03;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("B");

//      예제 2) 중복 제거해서 출력하기
        List<String> list2 = list.stream()
                .distinct()
                .collect(Collectors.toList());

        list2.forEach(s-> System.out.println(s)); // 중복 제거해서 출력
    }
}
