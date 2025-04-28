package chap15.section03.example09;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//      예제 6) 문자열 배열을 숫자 배열로 변환하세요
        String[] str = {"1", "2", "3"};
        int[] str2 = Arrays.stream(str)
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        Arrays.stream(str2).forEach(x -> System.out.println(x));
    }
}
