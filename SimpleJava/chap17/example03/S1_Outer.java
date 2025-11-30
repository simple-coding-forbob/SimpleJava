package chap17.example03;

/**
 * packageName : chap10.sec01.exam03
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 중첩클래스의 전역/일반 사용제한 #2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class S1_Outer {
//    TODO: 필드/메소드를 중첩클래스에서 사용하기: 접근 제한
//  결론: 일반 필드/메소드는 static 붙은 곳에 사용 불가
    int field;
    void method() {}

//    TODO: 일반 중첩클래스에서 테스트
    class Attr {
        void method() {
//            외부 클래스의 일반 속성(필드)/함수(메소드) 접근
            field = 10;       // O
            method();         // O
        }
    }
    static class Share {
        void method() {
//            외부 클래스의 일반 속성(필드)/함수(메소드) 접근
//            field = 10;       // x
//            method();         // x
        }
    }
}
