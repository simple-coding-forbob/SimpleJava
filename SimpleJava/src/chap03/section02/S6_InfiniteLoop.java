/**
 * 
 */
package chap03.section02;

/**
 * @author simple-coding
 *
 */
public class S6_InfiniteLoop {
	public static void main(String[] args) {

		int i=1;
		while(true) {
			System.out.println(i);
			if(i == 6) {
				break;
			}
			i++;
		}
	}
}