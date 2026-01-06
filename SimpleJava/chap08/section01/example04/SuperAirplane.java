package chap08.section01.example04;

public class SuperAirplane extends AirPlane {

    public int flyMode;
    
    public SuperAirplane(int flyMode) {
		this.flyMode = flyMode;
	}

	@Override
    public void fly() {
        if(flyMode == 1) {
            super.fly();       // super : 부모클래스 의미
        } else {
            System.out.println("초음속 비행합니다.");
        }
    }
}
