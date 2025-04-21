package chap12.section01.example04;

public class ClassCastApplication {

    public static void changeDog(Animal animal) {
        Dog dog = (Dog)animal;        // 형변환
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        changeDog(cat);        // 에러 발생
    }
}

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}
