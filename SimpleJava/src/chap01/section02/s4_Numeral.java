/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap01.section02;

/**
 * @author simple-coding
 */
public class s4_Numeral {
	public static void main(String[] args) {
		String a = Integer.toBinaryString(10);
		String b = Integer.toOctalString(10);
		String c = Integer.toHexString(10);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
