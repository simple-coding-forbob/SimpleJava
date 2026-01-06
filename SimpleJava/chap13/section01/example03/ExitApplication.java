package chap13.section01.example03;

public class ExitApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==5) {
                System.exit(0); // 정상종료 : 0, 비정상종료 : -1
            }
        }
    }
}
