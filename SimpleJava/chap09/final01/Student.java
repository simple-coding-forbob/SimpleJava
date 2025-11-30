package chap09.final01;

public class Student extends Person {
    void set() {
        age = 30;         // 부모속성
        name = "홍길동";   // 부모속성
        height = 175;     // 부모속성
        setWeight(99);    // 부모함수 ( 세터 : alt+insert )
    }
}
