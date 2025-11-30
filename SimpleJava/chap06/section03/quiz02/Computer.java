package chap06.section03.quiz02;

/**
 * @author simple-coding
 *
 */
public class Computer {
    void powerOff() {
        System.out.println("전원 끄기");
    }

    int minus(int x, int y) {
        return x - y;      
    }
    
    void comPrint(int x, int y) {
        System.out.println(minus(x, y));
        powerOff();
    }
}