package chap10.section02.korea;

public class Person {
    private int no;           // private 속성(필드)
    int name;                 // default 속성(필드)
    protected String address; // protected 속성(필드)

    void print() {     // public 함수(메소드)
        System.out.println("안녕");
    }
}
