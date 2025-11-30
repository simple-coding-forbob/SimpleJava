package chap14.section01.example08;

import java.util.HashMap;
import java.util.Map;

public class StudentApplication {
    public static void main(String[] args) {

        Map<String , Student > map = new HashMap<>();

        map.put("홍", new Student(1, "홍길동"));
        map.put("장", new Student(2, "장길산"));

        System.out.println(map);
    }
}
