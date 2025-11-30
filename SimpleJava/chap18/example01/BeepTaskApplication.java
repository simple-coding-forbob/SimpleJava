package chap18.example01;

public class BeepTaskApplication {
    public static void main(String[] args) {
//       Todo: 1) 삐소리 쓰레드 실행
        Runnable runnable = new BeepTask();   // 작업쓰레드 #1
        Thread thread = new Thread(runnable); // 작업쓰레드 #1 를 쓰레드에 넘김
        thread.start();                       // 쓰레드 실행

        System.out.println("띵");
    }
}
