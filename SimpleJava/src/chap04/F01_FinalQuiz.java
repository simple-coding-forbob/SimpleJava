/**
 * main 함수 단축키 : main
 * 자동완성 단축키    : ctrl + enter
 * 표시 단축키      : sysout
 * 실행           : 상단 메뉴 삼각형 아이콘
 */
package chap04;

import java.util.Scanner;

/**
 * @author simple-coding
 *
 */
public class F01_FinalQuiz {
	public static void main(String[] args) {
	    Scanner a = new Scanner(System.in);
	    int b = a.nextInt();
	    
	    if(b % 2 == 0) {
	    	System.out.println("even");
	    } else {
	    	System.out.println("odd");
	    }
	}
}
