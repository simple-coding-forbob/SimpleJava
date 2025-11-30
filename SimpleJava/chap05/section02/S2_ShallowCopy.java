/**
 * 
 */
package chap05.section02;

/**
 * @author simple-coding
 * 
 */
public class S2_ShallowCopy {
	public static void main(String[] args) {
		int[] o = { 1, 2 }; // 원본
		System.out.println(o[0]); 

		int[] n = o;                 // 얇은 복
		n[0] = 10;                   // 수정
		System.out.println(n[0]);    // 복사본값 출력
		System.out.println(o[0]);    // 원본값 출력
	}
}
