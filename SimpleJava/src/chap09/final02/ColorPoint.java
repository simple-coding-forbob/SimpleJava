package chap09.final02;

public class ColorPoint extends Point {
    String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {
        System.out.println(color); 
        showPoint();    
    }
}
