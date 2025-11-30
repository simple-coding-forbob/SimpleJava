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
public class S5_Switch {
	public static void main(String[] args) {
		int a = 9;

		switch(a) {
		case 9:
			System.out.println("출발");
			break;
		case 8:
			System.out.println("준비");
			break;
		default:
			System.out.println("대기");
			break;
		}
	}
}
