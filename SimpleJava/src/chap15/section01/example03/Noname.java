package chap15.section01.example03;

public class Noname {
    private int field;

    public void method(int arg) {
        int var = 10;                            // (지역)변수 => 상수로 변경됨

//        익명클래스
        Computer computer
                = new Computer() {
            @Override
            public int sum() {
                //        var = 2;                                // x
                //        arg = 3;                                // x
                return arg + var;
            }
        };
        System.out.println(computer.sum());   // 함수 실행
    }
}