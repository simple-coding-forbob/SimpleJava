package chap17.example02;

public class S2_Outer {
//  전역 중첩 클래스 필드/메소드에 사용하기 
//	결론 : static 있는 곳/없는 곳 모두 가능
    static class Share{}

//    TODO: 테스트 : 접근 제한
    Share share = new Share(); // O

    void method1() {
        Share share = new Share(); // O
    }

    static Share share2 = new Share(); // O

    static void method2() {
        Share share2 = new Share();    // O
    }
}





