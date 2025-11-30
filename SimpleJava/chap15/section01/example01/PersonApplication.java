package chap15.section01.example01;

public class PersonApplication {
    public static void main(String[] args) {
        Noname noname = new Noname();

        noname.person.wake();
        noname.method1();

        noname.method2(new Person() {
            @Override
            void wake() {
                System.out.println("17시에 일어납니다.");
            }
        });
    }
}