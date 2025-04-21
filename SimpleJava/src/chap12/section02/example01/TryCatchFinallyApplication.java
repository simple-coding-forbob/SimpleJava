package chap12.section02.example01;

public class TryCatchFinallyApplication {
    public static void main(String[] args) {
        try {
            String data = null;                  // 아무것도 없는 값
            System.out.println(data.toString()); // 예외 발생
        } catch (Exception e) {
        	System.out.println(e.toString());
            System.out.println("에러가 발생했습니다. 관리자에게 확인하세요");
        } finally {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}

