/**
 * 
 */
package chap06.section02.example03;

/**
 * @author simple-coding
 *
 */
public class Car {

    String company;
    int speed;
    
	public Car() {
		super();
	}

	public Car(String company) {
		super();
		this.company = company;
	}

	public Car(int speed) {
		super();
		this.speed = speed;
	}

	public Car(String company, int speed) {
		super();
		this.company = company;
		this.speed = speed;
	}   
}
