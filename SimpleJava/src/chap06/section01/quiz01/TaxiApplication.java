package chap06.section01.quiz01;

/**
 * @author simple-coding
 *
 */
public class TaxiApplication {
	public static void main(String[] args) {
      Taxi taxi = new Taxi(); 

      System.out.println(taxi.company);
      
      taxi.speed = 100;
      System.out.println(taxi.speed);	
	}
}
