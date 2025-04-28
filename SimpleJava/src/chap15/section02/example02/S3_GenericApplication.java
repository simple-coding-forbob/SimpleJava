package chap15.section02.example02;

import java.util.*;

public class S3_GenericApplication {
    public static void main(String[] args) {
        List<Integer> ival  = new ArrayList<>(); // Product 클래스만 가능
        List<String> sval     = new ArrayList<>();     // Tv 클래스만 가능
        
        List<?> list         = ival;               // 모두 가능
        List<?> list2         = sval;              // 모두 가능
        
//      에러: 배열 값 수정/추가 불가, 값 보기만 가능
//        list.add(1);                               // 에러
    }
}