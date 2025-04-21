/**
 * 
 */
package chap05.section01;

/**
 * @author simple-coding
 * 
 */
public class S7_PrefixSum {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int s=0;
		for (int i = 0; i < a.length; i++) {
			s=s+a[i];
		}
		System.out.println(s);
	}
}
