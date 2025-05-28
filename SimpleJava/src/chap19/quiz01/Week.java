/**
 * 
 */
package chap19.quiz01;

/**
 * @author TaeGyung
 * 열거형 전역 상수
 */
public enum Week {
	FRIDAY("금요일"),TUESDAY("화요일");
	
	private final String value;

	private Week(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
