package chap14.section01.example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("홍길동");
        list.add("장길산");
        list.add("임꺽정");
        
        list.remove(1);   //   중간값 삭제 ArrayList 보다 속도 빠름 : 
        
        System.out.println(list);
    }
}