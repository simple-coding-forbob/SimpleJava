package chap18.example01;

import java.awt.*;

public class BeepTask implements Runnable {
//    TODO: 1) 삐소리를 내는 쓰레드 , 2) 화면에  띵 5번 출력하는 쓰레드
    @Override
    public void run() {
//    TODO: 1) 삐소리를 내는 쓰레드 : 5번
//        자바 멀티미디어 클래스 import 사용 : java.awt.*;
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리내는 클래스 가져오기
        toolkit.beep(); // 삐소리
    }
}

