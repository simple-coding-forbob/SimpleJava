package chap14.section01.example06;

import java.util.Objects;

public class Member {
    public String name;    // 이름
    public int age;        // 나이

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Member member = (Member) o;
		return age == member.age && Objects.equals(name, member.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "Member{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
