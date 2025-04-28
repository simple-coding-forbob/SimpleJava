package chap14.section01.example05;

import java.util.HashSet;
import java.util.Set;

public class HashSetApplication {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

//        TODO: 추가 : .add(값)
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");

        for (String e : set) {
            System.out.println(e);
        }

        System.out.println(set.size());

        set.remove("c");             
        System.out.println(set);        
    }
}