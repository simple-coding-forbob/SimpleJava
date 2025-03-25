/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap01.section03;

/**
 * @author TaeGyung
 */
public class s6_Printf {
	public static void main(String[] args) {
		System.out.printf("%d", 10);      // 정수 10 출력
		System.out.println();
		
		System.out.printf("%s", "hi"); // 문자열 출력
		System.out.println();
		
		System.out.printf("%x", 10);     // 16진수 출력 답 : a
	}
}
