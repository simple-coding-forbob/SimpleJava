package chap11.final02;

public class DriverApplication {
    public static void main(String[] args) {
        Flyable flyable = new Bat();
        flyable.fly();

        flyable = new Sparrow();
        flyable.fly();

        Swimable swimable = new Whale();
        swimable.swim();
    }
}
