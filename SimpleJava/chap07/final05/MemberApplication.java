package chap07.final05;

public class MemberApplication {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();
        memberService.login();
        memberService.logout();
    }
}
