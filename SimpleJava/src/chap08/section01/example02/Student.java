package chap08.section01.example02;

public class Student extends People {
    public int no;  

    public Student(String name, int no) {
        super(name);
        this.no = no;
    }
}
