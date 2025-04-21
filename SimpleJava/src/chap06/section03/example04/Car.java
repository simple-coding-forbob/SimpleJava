package chap06.section03.example04;

/**
 * @author simple-coding
 *
 */
public class Car {

	void myPrint(String brand) {
		System.out.println(brand);
	}
	
	void myPrint(int speed) {
		System.out.println(speed);
	}
	
	void myPrint(String brand, int speed) {
		System.out.println(brand + "," + speed);
	}
}
