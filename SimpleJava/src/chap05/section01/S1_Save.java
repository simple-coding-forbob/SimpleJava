/**
 * 
 */
package chap05.section01;

/**
 * @author kangtaegyung
 *  
 */
public class S1_Save {
	public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = new String("홍길동");

        if(str1.equals(str2) == true) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }	
	}
}
