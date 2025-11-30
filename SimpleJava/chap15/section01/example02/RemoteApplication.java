package chap15.section01.example02;

public class RemoteApplication {
    public static void main(String[] args) {
        Noname noname = new Noname();

        noname.remote.turnOn();
        noname.method1();

        noname.method2(new Remote() {
            @Override
            public void turnOn() {
                System.out.println("스마트 tv 를 켭니다.");
            }
        });
    }
}