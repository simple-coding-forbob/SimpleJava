package chap13.section01.example10;

import java.util.Arrays;

public class SplitApplication {
    public static void main(String[] args) {
        String ssn = "123456-1234567";

        String[] str = ssn.split("-");
        System.out.println(Arrays.toString(str)); // [123456, 1234567]
    }
}
