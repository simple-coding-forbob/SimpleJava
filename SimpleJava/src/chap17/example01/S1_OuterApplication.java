package chap17.example01;

public class S1_OuterApplication {
    public static void main(String[] args) {
//      1) 외부클래스 변수 = new 생성자();
        S1_Outer outer = new S1_Outer();

//      2) 외부.내부클래스 변수2 = 변수.new 생성자();
        S1_Outer.Attr attr = outer.new Attr();
    }
}
