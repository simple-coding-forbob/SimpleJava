package chap13.section01.example04;

public class CarApplication {
    public static void main(String[] args) {
//      Car.java : 소스 -> 컴파일(빌드) -> Car.class
        Class clazz = Car.class;   // 클래스 파일 이름

        System.out.println(clazz.getName()); // 패키지 + 클래스명 정보
        System.out.println(clazz.getSimpleName()); // 클래스명 정보
    }
}
