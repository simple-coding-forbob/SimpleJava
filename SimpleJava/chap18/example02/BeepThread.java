package chap18.example02;

import java.awt.*;

public class BeepThread extends Thread {
//    함수 재정의 : run()
    @Override
    public void run() {
        // TODO: 1) 삐소리를 내는 쓰레드
//        자바 멀티미디어 클래스 import 사용 : java.awt.*;
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리내는 클래스 가져오기
        toolkit.beep(); // 삐소리
    }
}
