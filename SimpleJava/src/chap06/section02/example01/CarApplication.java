package chap06.section02.example01;

/**
 * @author simple-coding
 *
 */
public class CarApplication {
    public static void main(String[] args) {

        Car car = new Car("검정");
        Car car2 = new Car("흰색");

        System.out.println(car.color);     // 검정
        System.out.println(car2.color);    // 흰색
    }
}
