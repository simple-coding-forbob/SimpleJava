package chap13.section01.example06;

public class IndexOfApplication {
    public static void main(String[] args) {
        String subject = "자바 프로그램";
        
        int pos = subject.indexOf("프로그램");
        System.out.println(pos);              // 3
    }
}
