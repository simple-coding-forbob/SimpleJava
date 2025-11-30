package chap12.section01.example01;

public class NullApplication {
    public static void main(String[] args) {
        String data = null;                  // 아무것도 없는 값

        System.out.println(data.toString()); // 에러(예외) 발생
    }
}
