package chap15.section02.example02;

import java.util.*;

public class S2_GenericApplication {
    public static void main(String[] args) {
        List<Product> parents = new ArrayList<>(); // Product 클래스만 가능
        List<Audio> child     = new ArrayList<>(); // Tv 클래스만 가능
        
        List<? extends Audio> list = child;       // 자신과 자식만 가능
        List<? super Audio> list2 = parents;      // 자신과 부모만 가능
    }
}