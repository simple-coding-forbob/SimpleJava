package chap14.section01.example07;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("no", 1);
        map.put("name", "홍길동");
        System.out.println(map);

        System.out.println(map.size());      

        System.out.println(map.get("no")); 

        map.remove("no");
        System.out.println(map);
    }
}
