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

	private Week(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
