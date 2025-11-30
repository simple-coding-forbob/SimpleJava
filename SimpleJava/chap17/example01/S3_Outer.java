package chap17.example01;

public class S3_Outer {
//    TODO: 메소드 중첩 클래스 == 로컬(지역) 클래스
    void method() {
        class Local {
            public Local() {
                System.out.println("Local 클래스 생성 ");
            }
            void func(){}
        }
        Local local = new Local();
        local.func();
    }
}







