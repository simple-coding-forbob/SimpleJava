package chap13.section01.quiz01;

import java.util.Objects;

public class Member {
    public String name;

	public Member(String name) {
        this.name = name;
    }

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Member member = (Member) o;
		return Objects.equals(name, member.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
}
