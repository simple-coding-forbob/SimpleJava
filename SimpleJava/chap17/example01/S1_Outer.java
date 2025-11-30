package chap17.example01;

/**
 * packageName : chap10.sec01.exam01
 * fileName : Outer
 * author : GGG
 * date : 2024-02-20
 * description : 중첩클래스 : 클래스 안에 클래스 (특수클래스)
 * 요약 :
 *      1) 중첩클래스 정의 :
 *          - 속성(필드) 위치에 만들기 : 일반/전역
 *          - 함수(메소드) 안에 만들기
 *      2) 중첩클래스 사용 :
 *          - 1) 외부 클래스 생성 : 외부클래스 변수 = new 생성자();
 *          - 2) 내부 클래스 생성 : 외부.내부클래스 변수2 = 변수.new 생성자();
 *          - 3) 전역은 바로 사용 : 외부.내부.속성, 외부.내부.함수()
 *          - 4) 로컬클래스      : 함수 호출 (내부 클래스 자동생성)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class S1_Outer {
//    TODO: 일반 필드 중첩클래스
    public class Attr {
        int field1;
        public Attr() {
            System.out.println("Attr 클래스 생성 ");
        }
        void method1() {}
    }
}