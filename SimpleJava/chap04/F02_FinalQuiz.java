/**
 * 
 */
package chap04;

import java.util.Scanner;

/**
 * @author kangtaegyung
 *
 */
public class F02_FinalQuiz {
	public static void main(String[] args) {
	    Scanner a = new Scanner(System.in);
	    int b = a.nextInt();
	    
	    if(b % 3 == 0) {
	    	System.out.println("yes");
	    } else {
	    	System.out.println("no");
	    }		
	}
}
