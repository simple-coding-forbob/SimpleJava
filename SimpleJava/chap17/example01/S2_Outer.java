package chap17.example01;

public class S2_Outer {

//    TODO: 1-2) 전역 속성(필드) 중첩클래스
    static class Share {
        static void method1(){
        	System.out.println("전역 메소드 실행 ");
        } // 전역 함수(메소드)
        void method2(){
        	System.out.println("일반 메소드 실행 ");
        };
    }
}







