package chap07.final02;

public class MemberApplication {
    public static void main(String[] args) {

        Member member = new Member("홍길동", "hong");

        System.out.println(member.id);
        System.out.println(member.name);
    }
}
