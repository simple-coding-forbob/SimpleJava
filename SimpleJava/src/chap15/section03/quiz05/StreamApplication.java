package chap15.section03.quiz05;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("B");
        list.add("B");

//      예제 4) 전체 개수에서 2개만 출력하기
        List<String> list5 = list.stream()
                .limit(2)
                .collect(Collectors.toList());

        list5.forEach(s-> System.out.println(s)); // 5개만 출력하기
    }
}
