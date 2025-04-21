package chap13.section01.example09;

public class SubStringApplication {
    public static void main(String[] args) {
        String ssn = "123456-1234567";

        String str = ssn.substring(0, 6); // 0 ~ (6-1)까지 잘림
        System.out.println(str);          // 123456
    }
}
