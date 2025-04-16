/**
 * 
 */
package chap04;

import java.util.Scanner;

/**
 * @author kangtaegyung
 *
 */
public class F10_FinalQuiz {
	public static void main(String[] args) {
	    Scanner a = new Scanner(System.in);
	    int b = a.nextInt();
	    
	    for (int i=1; i < b; i++) {
	    	if(i % 2 == 0) {
				System.out.println(i);	    		
	    	}
		}
	}
}
