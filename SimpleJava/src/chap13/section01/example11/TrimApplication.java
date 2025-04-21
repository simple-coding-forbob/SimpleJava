package chap13.section01.example11;

public class TrimApplication {
    public static void main(String[] args) {
        String tel = " 02";
        String tel2 = " 0 2 ";

        System.out.println(tel.trim());   // 02
        System.out.println(tel2.trim());  // 0 2
    }
}
