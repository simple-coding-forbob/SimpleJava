/**
 * 
 */
package chap19.example01;

/**
 * @author TaeGyung
 * 열거형 전역 상수
 */
public enum Week {
	MONDAY("월요일"),SUNDAY("일요일");
	
	private final String value;

//	매개변수 1개 생성자
	Week(String value) {
		this.value = value;
	}

//	getter
	public String getValue() {
		return value;
	}
}
