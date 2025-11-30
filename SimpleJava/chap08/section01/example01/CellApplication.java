package chap08.section01.example01;

public class CellApplication {
    public static void main(String[] args) {

        DmbCellPhone dmbCellPhone
                = new DmbCellPhone("자바", 10);

        System.out.println(dmbCellPhone.model);    // 부모속성
        System.out.println(dmbCellPhone.channel);  // 자식속성(dmbCellPhone)

        dmbCellPhone.powerOn();                     // 부모함수
        dmbCellPhone.turnOn();                      // 자식함수
    }
}
