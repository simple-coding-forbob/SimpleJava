package chap15.section03.quiz06;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//        TODO: 실습 예제
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("B");
        list.add("B");

//        TODO: 3) filter 사용 : 일부만 걸러내기
//          예제 : 배열값에서 문자길이가 3초과인 값만으로 새로운 배열 만들기
//         사용법 : 1) 정의부      : list.stream()
//                 2) 가공        : .filter(s -> s.length() > 3)
//                 3) 결과내보내기 : .collect(Collectors.toList());
        List<String> list6 = list.stream()
                .filter(s -> s.equals("B"))
                .collect(Collectors.toList());
        list6.forEach(s -> System.out.println(s)); // 3초과인 배열 출력
    }
}
