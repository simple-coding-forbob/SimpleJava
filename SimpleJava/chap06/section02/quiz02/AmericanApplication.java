package chap06.section02.quiz02;

/**
 * @author simple-coding
 *
 */
public class AmericanApplication {
	public static void main(String[] args) {
        American american = new American("James", "123");
        American american2 = new American("Bond", "234");

        System.out.println(american.name);
        System.out.println(american2.num);

        System.out.println(american2.name); 
        System.out.println(american2.num);		
	}
}
