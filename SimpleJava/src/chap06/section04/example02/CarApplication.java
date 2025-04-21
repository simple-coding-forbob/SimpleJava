package chap06.section04.example02;


public class CarApplication {
    int speed;     // 속성(필드)

    public static void main(String[] args) {

        CarApplication car = new CarApplication();   
        car.speed = 60;
        System.out.println(car.speed);  
    }
}
