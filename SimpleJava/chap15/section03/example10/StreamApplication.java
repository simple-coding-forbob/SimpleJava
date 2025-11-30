package chap15.section03.example10;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
//      예제 6) 숫자 배열을 문자 배열로 변환하세요
        int[] val = {1, 2, 3};
        String[] str = Arrays.stream(val)
                .mapToObj(x -> String.valueOf(x))
                .toArray(x->new String[x]);
        Arrays.stream(str).forEach(x -> System.out.println(x));
    }
}
