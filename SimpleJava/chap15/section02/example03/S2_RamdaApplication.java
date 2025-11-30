package chap15.section02.example03;

@FunctionalInterface
interface MyScience {
	int score();
}
public class S2_RamdaApplication {
	public static void main(String[] args) {
		MyScience m = new MyScience() {
			@Override
			public int score() {
				return 70;
			}
		};
		System.out.println(m.score());
		
		MyScience m2 = () -> 70;
		System.out.println(m2.score());
	}
}