package chap10.section01.example02;

public class RemoteApplication {
    public static void main(String[] args) {
        Remote rc = new Tv();
        rc.turnOn();      

        rc = new Audio();
        rc.turnOn();       
    }
}
