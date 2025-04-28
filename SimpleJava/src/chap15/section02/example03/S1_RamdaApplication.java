package chap15.section02.example03;

@FunctionalInterface
interface MyMath {
	void score();
}

public class S1_RamdaApplication {
	public static void main(String[] args) {
		MyMath m = new MyMath() {
			@Override
			public void score() {
				System.out.println(60);
			}
		};
		m.score();
		
		MyMath m2 = () -> System.out.println(60);
		m2.score();
	}
}