package chap15.section02.example02;

import java.util.*;

public class S1_GenericApplication {
    public static void main(String[] args) {
        List<Product> parents = new ArrayList<>(); // Product 클래스만 가능
        List<Audio> child     = new ArrayList<>(); // Tv 클래스만 가능

        parents.add(new Audio());                  // 가능
        child.add(new Audio());
//        list2.add(new Product());                // 불가능(부모클래스 안됨)
    }
}