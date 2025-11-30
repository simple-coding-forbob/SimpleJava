package chap08.section02.quiz01;

public class StudentApplication {
    public static void main(String[] args) {

        Student student = new Student();     // 자식 1
        Student2 student2 = new Student2();  // 자식 2

        People people = student;
        people.method();        

        people = student2;
        people.method();        
    }
}
