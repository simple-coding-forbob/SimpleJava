package chap08.section01.example02;

public class StudentApplication {
    public static void main(String[] args) {

        Student student
                = new Student("홍길동",1);
        System.out.println(student.name);        // 부모속성
        System.out.println(student.no);   // 자식속성
    }
}
