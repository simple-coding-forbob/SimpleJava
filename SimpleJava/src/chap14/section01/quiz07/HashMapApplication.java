package chap14.section01.quiz07;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("no", 2);
        map.put("name", "장길산");
        System.out.println(map);
    }
}
