package chap14.section02.example02;

public class Coin {
    private int value;   // 동전값
//    생성자 : 1개
    public Coin(int value) {
        this.value = value;
    }

//    setter/getter 함수
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

	@Override
	public String toString() {
		return "Coin [value=" + value + "]";
	}
}