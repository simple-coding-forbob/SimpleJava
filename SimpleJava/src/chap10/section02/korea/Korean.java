package chap10.section02.korea;

public class Korean extends Person{

    public void printKorean() {
        System.out.println(address); // protected (사용가능)
        System.out.println(name);    // default (사용가능)
//        System.out.println(no);      // private (사용불가)
    }
}