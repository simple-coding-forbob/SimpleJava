package chap13.section01.example02;

public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");

        System.out.println(smartPhone.toString());
//        System.out.println(smartPhone);                // 생략가능
    }
}
