package chap18.example02;

public class BeepApplication {
    public static void main(String[] args) {
        Thread thread = new BeepThread(); // 다형성
        thread.start(); // 삐소리 쓰레드 실행

        System.out.println("띵");
    }
}
