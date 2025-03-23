/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap01.section02;

/**
 * @author simple-coding
 * 예제) 정수 10 을 2진수, 8진수, 16진수로 화면에 표시하세요
 * 단, Integer.toBinaryString(),
 *    Integer.toOctalString(),
 *    Integer.toHexString() 기능을 이용하세요
 */
public class s4_numeral {
	public static void main(String[] args) {
		String a = Integer.toBinaryString(10);
		String b = Integer.toOctalString(10);
		String c = Integer.toHexString(10);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
