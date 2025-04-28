package chap15.section03.quiz02;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("B");
        list.add("B");

//      연습 1) 소문자로 바꾸어서 출력하기 : 글자.toLowerCase()
        List<String> list2 = list.stream()
                .map(s-> s.toLowerCase())
                .collect(Collectors.toList());

        list2.forEach(s-> System.out.println(s));
    }
}
