package chap06.section02.example02;

/**
 * @author simple-coding
 *
 */
public class KoreanApplication {
    public static void main(String[] args) {
        Korean korean = new Korean("홍길동", "123456");
        Korean korean2 = new Korean("임꺽정", "234567");

        System.out.println(korean.name); 
        System.out.println(korean.ssn);

        System.out.println(korean2.name); 
        System.out.println(korean2.ssn);
    }
}
