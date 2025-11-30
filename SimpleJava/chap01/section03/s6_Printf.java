/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap01.section03;

/**
 * @author simple-coding
 */
public class s6_Printf {
	public static void main(String[] args) {
		System.out.printf("%d", 10);      
		System.out.println();
		
		System.out.printf("%s", "hi"); 
		System.out.println();
		
		System.out.printf("%x", 10);   
		System.out.println();
		System.out.printf("%.3f", 3.14127);     
	}
}
