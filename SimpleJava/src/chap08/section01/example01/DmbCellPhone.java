package chap08.section01.example01;

public class DmbCellPhone extends CellPhone {

    int channel;

    public DmbCellPhone(String model, int channel) {
        this.model = model;
        this.channel = channel;
    }

    void turnOn() {
        System.out.println("tv 를 수신합니다.");
    }
}
