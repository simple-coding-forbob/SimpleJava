package chap17.example05;
// 주제: 내부 클래스 this 사용
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