package chap15.section01.example01;

public class Noname {
//    TODO: 1) 속성(필드) : 아래 부모클래스의 함수를 재정의
    Person person = new Person() {
        @Override
        void wake() {
            System.out.println("5시에 일어납니다.");
        }
    };

//   TODO: 2) 함수안에서 사용하기
    void method1() {
        Person person2 = new Person() {
            @Override
            void wake() {
                System.out.println("12시에 일어납니다.");
            }
        };
        person2.wake();
    }

//   TODO: 3) 함수의 매개변수로 사용하기
    void method2(Person person) {
        person.wake();
    }
}