package chap14.section01.quiz05;

import java.util.HashSet;
import java.util.Set;

public class HashSetApplication {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("가");
        set.add("가");
        set.add("나");
        set.add("나");

        for (String e : set) {
            System.out.println(e);
        }
    }
}