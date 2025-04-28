package chap15.section03.example01;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("B");

//      TODO: 1) forEach 사용 : 단순 출력용
        list.forEach(s -> System.out.println(s)); // 1번 코딩
        list.forEach(System.out::println);        // 2번 코딩
    }
}