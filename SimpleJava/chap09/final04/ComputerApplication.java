package chap09.final04;

public class ComputerApplication {
    public static void main(String[] args) {
// 문제 4: 아래 샐행 결과를 보고 Computer 객체를 디자인(코딩)하세요
        Computer computer = new Computer();

        computer.turnOn();    // "전원을 켭니다." 출력
        computer.displayOn(); // "화면을 켭니다." 출력
        computer.typeOn();    // "타이핑을 합니다." 출력
        computer.turnOff();   // "전원을 끕니다." 출력
    }
}
