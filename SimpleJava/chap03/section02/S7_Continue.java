/**
 * 
 */
package chap03.section02;

/**
 * @author simple-coding
 *
 */
public class S7_Continue {
	public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
	}
}