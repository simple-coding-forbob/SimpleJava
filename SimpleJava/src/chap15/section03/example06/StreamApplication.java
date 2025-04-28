package chap15.section03.example06;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("B");

//        TODO: 3) filter 사용 : 일부만 걸러내기
        List<String> list2 = list.stream()
                .filter(s -> s.equals("a"))
                .collect(Collectors.toList());
        list2.forEach(s -> System.out.println(s)); // 3초과인 배열 출력
    }
}
