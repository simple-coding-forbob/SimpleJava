package chap08.section01.quiz04;

public class SuperCar extends Car {

    public int mode;
    
    public SuperCar(int mode) {
		this.mode = mode;
	}

	@Override
    public void run() {
        if(mode == 2) {
            System.out.println("300km 로 달립니다.");
        } else {
            super.run();       // super : 부모클래스 의미
        }
    }
}
