package chap06.section03.example02;

/**
 * @author simple-coding
 *
 */
public class Calculator {
    //    속성(필드) 없음

    void powerOn() {
        System.out.println("전원 켜기");
    }

    int plus(int x, int y) {
        return x + y;      
    }

    void myPrint(int x, int y) {
        powerOn();
        System.out.println(plus(x, y));
    }
}






