package chap14.section01.example08;

import java.util.Objects;

public class Student {
    public int sno;      // 학번
    public String name;  // 이름

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return sno == student.sno && Objects.equals(name, student.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(sno, name);
	}
	@Override
	public String toString() {
		return "Student{" +
				"sno=" + sno +
				", name='" + name + '\'' +
				'}';
	}
}
