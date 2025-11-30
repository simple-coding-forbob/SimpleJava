package chap13.section01.example12;

public class MathApplication {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 10;
//      TODO: 최대값 : Math.max(값, 값2)
        System.out.println(Math.max(v1, v2));  // 10
//      TODO: 최소값 : Math.min(값, 값2)
        System.out.println(Math.min(v1, v2));  // 5

        int v3 = -1;
//      TODO: 절대값(무조건 양수로 만듬):  Math.abs(값)
        System.out.println(Math.abs(v3));      // 1

        double v4 = 5.3;
//      TODO: 올림                   : Math.ceil(값)
        System.out.println(Math.ceil(v4));     // 6
//      TODO: 내림                   : Math.floor(값)
        System.out.println(Math.floor(v4));    // 5
//      TODO: 반올림                 : Math.round(값)
        System.out.println(Math.round(v4));    // 5
    }
}
