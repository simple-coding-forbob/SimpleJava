package chap15.section03.example08;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
        String[] str = {"a", "a", "B"};

        String[] str2 = Arrays.stream(str)
                .map(s-> s.toUpperCase())
                .toArray(x -> new String[x]);

        Arrays.stream(str2).forEach(s-> System.out.println(s));
    }
}