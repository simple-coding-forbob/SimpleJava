package chap08.section02.example03;

public class ChildApplication {
    public static void main(String[] args) {

        Parent parent = new Child(); 
        parent.method1();

        Child child = (Child) parent;
        child.method2();
    }
}