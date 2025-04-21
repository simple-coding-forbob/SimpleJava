package chap08.section01.quiz01;

public class TabletApplication {
	public static void main(String[] args) {

		IPad ipad = new IPad("애플");

		System.out.println(ipad.brand); // 부모필드

		ipad.click(); // 자식함수
		ipad.powerOff(); // 부모함수
	}
}
