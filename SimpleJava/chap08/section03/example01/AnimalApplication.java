package chap08.section03.example01;

public class AnimalApplication {
    public static void main(String[] args) {

        Animal animal = new Dog();   // 다형성
        animal.sound();       // 멍멍

        animal = new Cat();    // 다형성
        animal.sound();        // 야옹
    }
}
