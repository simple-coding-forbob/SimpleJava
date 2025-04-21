package chap13.section01.quiz10;

import java.util.Arrays;

public class SplitApplication {
    public static void main(String[] args) {
        String ssn = "010-123-1234";

        String[] str = ssn.split("-");
        System.out.println(Arrays.toString(str)); // [123456, 1234567]
    }
}
