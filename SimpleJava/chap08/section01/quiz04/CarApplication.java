package chap08.section01.quiz04;

public class CarApplication {
    public static void main(String[] args) {

        SuperCar superCar
                = new SuperCar(1);
 
        superCar.run();

        superCar.mode = 2;
        superCar.run();          
    }
}
