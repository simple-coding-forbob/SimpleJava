package chap09.final02;

public class Point {

    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //    (3,4) 출력하는 함수
    void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
