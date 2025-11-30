package chap17.example01;

import chap17.example01.S2_Outer.Share;

public class S2_OuterApplication {
    public static void main(String[] args) {
//       2) 중첩클래스(클래스안에 클래스) : Share (전역 속성(필드))
        S2_Outer.Share.method1();    // 중첩클래스의 전역함수(메소드)
        
    	S2_Outer.Share s1 = new S2_Outer.Share();
    	s1.method2();                // 중첩클래스의 일반메소드
    	

    }
}
