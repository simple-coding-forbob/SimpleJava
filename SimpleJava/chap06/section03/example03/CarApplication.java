package chap06.section03.example03;

public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(10);
        System.out.println(car.getSpeed());
    }
}