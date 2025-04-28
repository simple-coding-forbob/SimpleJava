package chap15.section02.quiz03;

@FunctionalInterface
interface MyMath {
	void score();
}

public class RamdaApplication {
	public static void main(String[] args) {
		MyMath m = new MyMath() {
			@Override
			public void score() {
				System.out.println(100);
			}
		};
		m.score();
		
		// 람다식을 작성하세요 
		MyMath m2 = () -> System.out.println(100);
		m2.score();
	}
}