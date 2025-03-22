/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap01.section01;

/**
 * @author simple-coding
 * 예제) 정수 a 에는 3 이 있습니다.
 *     정수 b 에는 2 가 있습니다. 
 *     서로 값을 바꾸어서 a에는 b 를 넣고, b에는 a 를 넣어
 *     화면에 표시하세요 
 *     서로 값을 바꾸는 것을 스왑(swap) 코딩이라고 합니다.
 *     단, 임시 저장공간(변수)만 이용합니다.
 */
public class s7_swap {
	public static void main(String[] args) {
		int a=3;
		int b=2;
		int t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
	}
}
