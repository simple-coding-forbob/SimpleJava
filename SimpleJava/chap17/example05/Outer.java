package chap17.example05;

public class Outer {
    void method() {}
    
    class Inner{
        void func() {}
        void print() {
            this.func();
            Outer.this.method();
        }
    }
}