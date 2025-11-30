package chap06.section01.example01;

/**
 * @author simple-coding
 *
 */
public class CarApplication {
	public static void main(String[] args) {
      Car car = new Car(); 

      System.out.println(car.company);
      
      car.maxSpeed = 60;
      System.out.println(car.maxSpeed);	
	}
}
