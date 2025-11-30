package chap06.section04.example03;


public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("홍길동");

        System.out.println(person.nation); // 상수
        System.out.println(person.name);   // 속성(필드)

//      테스트: 상수값 수정
//        person.nation = "CANADA";          // (x) 수정불가(why? 상수)
    }
}
