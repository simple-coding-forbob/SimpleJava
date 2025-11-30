package chap15.section01.example02;

public class Noname {
//  1) 필드에서 익명클래스 사용
    Remote remote
            = new Remote() {
        @Override
        public void turnOn() {
            System.out.println("Tv 를 켭니다.");
        }
    };

//  2) 메소드 안에서 익명클래스 사용
    void method1() {
        Remote remote2
                = new Remote() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
            }
        };
        remote2.turnOn();
    }

//  3) 메소드 매개변수로 익명클래스 사용
    void method2(Remote remote) {
    	remote.turnOn();
    }
}
