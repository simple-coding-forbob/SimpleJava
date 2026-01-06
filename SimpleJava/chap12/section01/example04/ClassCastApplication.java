package chap12.section01.example04;

public class ClassCastApplication {

    public static void main(String[] args) {
        Animal animal=new Cat();
        Dog dog = (Dog)animal;
    }
}

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}
