package chap08.section02.example01;

public class ChildApplication {
    public static void main(String[] args) {

        Child child = new Child();     // 자식 1
        Child2 child2 = new Child2();  // 자식 2

        Parent parent = child;
        parent.method();        

        parent = child2;
        parent.method();        
    }
}
