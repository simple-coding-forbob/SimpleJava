package chap15.section03.example04;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("B");

//      예제 3) 첫번째 제외하고 출력하기
        List<String> list2 = list.stream()
                .skip(1)
                .collect(Collectors.toList());

        list2.forEach(s-> System.out.println(s)); // 첫번째 원소는 제외 출력

    }
}
