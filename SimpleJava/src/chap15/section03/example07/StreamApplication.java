package chap15.section03.example07;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
        String[] values = {"a", "a", "B"};

//      TODO: 1) forEach 사용 : 단순 출력용
        Arrays.stream(values).forEach(x -> System.out.println(x));
        Arrays.stream(values).forEach(System.out::println);
    }
}
