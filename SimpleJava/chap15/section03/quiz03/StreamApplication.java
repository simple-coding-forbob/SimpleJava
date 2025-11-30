package chap15.section03.quiz03;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("B");
        list.add("B");

//      예제 2) 중복 제거해서 출력하기
        List<String> list3 = list.stream()
                .distinct()
                .collect(Collectors.toList());

        list3.forEach(s-> System.out.println(s)); // 중복 제거해서 출력
    }
}
