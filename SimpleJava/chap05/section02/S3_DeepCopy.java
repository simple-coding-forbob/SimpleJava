/**
 * 
 */
package chap05.section02;

/**
 * @author simple-coding
 * 
 */
public class S3_DeepCopy {
	public static void main(String[] args) {
		int[] o = { 1, 2 };         // 원본
		int[] n = new int[2];       // 복사본 방예약 2개
		System.out.println(o[0]); 

        for (int i = 0; i < o.length; i++) {
            n[i] = o[i];
        }
		n[0] = 10;                   // 수정
		System.out.println(n[0]);    // 복사본값 출력
		System.out.println(o[0]);    // 원본값 출력
	}
}
