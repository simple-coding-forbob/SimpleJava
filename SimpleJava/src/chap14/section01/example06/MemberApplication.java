package chap14.section01.example06;

import java.util.HashSet;
import java.util.Set;

public class MemberApplication {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

//      집합 : 객체(생성해서) 넣기
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        System.out.println(set);
    }
}