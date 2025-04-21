package chap13.section01.example08;

public class ReplaceApplication {
    public static void main(String[] args) {
        String old = "자바 프로그램. 자바 API";  // 원본
        String newStr = old.replace("자바", "Java");

        System.out.println(old);
        System.out.println(newStr);
    }
}
