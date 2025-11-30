package chap18.example03;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        TODO: 1 쓰레드 실행
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();                  // 쓰레드 실행 1

//        TODO: 2 쓰레드 실행
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();                  // 쓰레드 실행2 
    }
}
