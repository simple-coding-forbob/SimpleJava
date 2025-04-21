package chap13.section01.example01;

public class MemberApplication {
    public static void main(String[] args) {
        Member member = new Member("blue");
        Member member2 = new Member("blue");

        if(member.equals(member2)) {
            System.out.println("member 와 member2는 같습니다.");
        } else {
            System.out.println("member 와 member2는 다릅니다.");
        }
    }
}
