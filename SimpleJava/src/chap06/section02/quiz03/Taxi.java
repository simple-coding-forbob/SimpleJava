/**
 * 
 */
package chap06.section02.quiz03;

/**
 * @author simple-coding
 *
 */
public class Taxi {

    String model;
    int maxSpeed;
    
	public Taxi() {
		super();
	}

	public Taxi(String model) {
		super();
		this.model = model;
	}

	public Taxi(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public Taxi(String model, int maxSpeed) {
		super();
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
		
}
