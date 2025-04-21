package chap12.section02.example04;

public class ThrowsApplication {

    public static void findClass() throws Exception {
        String data = null;                  // 아무것도 없는 값
        System.out.println(data.toString()); // 에러(예외) 발생
    }

    public static void main(String[] args) {
        try {
            findClass();                    // 전역함수 실행
        } catch (Exception e) {
        	System.out.println(e.toString());
            System.out.println("에러가 발생했습니다. 관리자에게 확인하세요");
        }
    }
}