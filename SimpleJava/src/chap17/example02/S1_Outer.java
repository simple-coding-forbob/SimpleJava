package chap17.example02;

public class S1_Outer {
//  중첩 클래스를 필드/메소드에 사용하기
//	결론: static(전역) 이 붙은 곳에 사용 불가
    class Attr{}

//    TODO: 테스트 : 접근 제한
    Attr attr = new Attr();    // O
//  static Attr attr2 = new Attr();  // x (Attr : 일반 중첩클래스)
    
    void method1() {
        Attr attr = new Attr();    // O
    }

    static void method2() {
//        Attr attr2 = new Attr();       // x (Attr : 일반 중첩클래스)
    }
}





