/**
 * 
 */
package chap03.section02;

/**
 * @author simple-coding
 *
 */
public class S5_ForInFor {
	public static void main(String[] args) {

       for (int i = 2; i <= 9; i++) {
           for (int j = 1; j <= 9 ; j++) {
               System.out.println(i + " X " + j + " = " + (i*j));
           }
       }
	}
}