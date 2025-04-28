package chap14.section01.example02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApplication {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//      TODO: 추가
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

//      TODO: 수정
        list.set(0, "가");
        System.out.println(list);

//      TODO: 삭제
        list.remove(0);
        System.out.println(list);

        System.out.print(list.get(0)); 
    }
}
