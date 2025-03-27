/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap03.section01;

/**
 * @author simple-coding
 *
 */
public class S3_If3 {
	public static void main(String[] args) {
		int a=9;
		
		if(a>9) {
			System.out.println("출발");
		} else if(a==9){
			System.out.println("준비");
		}
		else {
			System.out.println("대기");
		}
	}
}
