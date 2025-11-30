package chap13.section01.example03;

public class SystemTimeApplication {
    public static void main(String[] args) {
//        TODO: 1) 처음시간 측정
        long time = System.nanoTime(); // 1/10^9 시간

//        TODO: 2) 실행문 실행 : 반복문(1~1000000)
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum = sum + i;
        }
//        TODO:  3) 끝시간 측정 : 끝시간 - 처음시간 = 소요시간
        long time2 = System.nanoTime(); // 1/10^9 시간
        System.out.println(time2 - time);
    }
}
