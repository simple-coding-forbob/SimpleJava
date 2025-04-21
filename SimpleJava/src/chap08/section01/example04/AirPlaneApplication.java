package chap08.section01.example04;

public class AirPlaneApplication {
    public static void main(String[] args) {

        SuperAirplane superAirplane
                = new SuperAirplane(1);

        superAirplane.takeOff();   
        superAirplane.fly();       

        superAirplane.flyMode = 2;
        superAirplane.fly();          
    }
}
