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
public class S2_Outer {
//    TODO: 전역 필드/메소드를 중첩클래스에서 사용하기: 접근 제한
//  결론: 전역 필드/메소드는 static 있는 곳/없는 곳 모두 사용 가능
    static int field;       
    static void method() {} 

//    TODO: 일반 중첩클래스에서 테스트
    class Attr {
        void method() {      
            field = 10;       // O
            method();         // O
        }
    }
    static class Share {
        void method() {
            field = 10;       // O
            method();         // O
        }
    }
}
