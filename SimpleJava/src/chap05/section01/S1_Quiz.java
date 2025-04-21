/**
 * 
 */
package chap05.section01;

/**
 * @author simple-coding
 *  
 */
public class S1_Quiz {
	public static void main(String[] args) {
        String str1 ="장길산";
        String str2 = new String("장길산");

        if(str1.equals(str2) == true) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }	
	}
}
