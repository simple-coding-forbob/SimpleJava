package chap10.section01.example03;

public class SoundableApplication {

    static void print(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        print(cat);           // 야옹
        print(dog);           // 멍멍 (다형성)
    }
}
