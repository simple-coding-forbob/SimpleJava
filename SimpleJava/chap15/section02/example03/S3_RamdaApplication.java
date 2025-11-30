package chap15.section02.example03;

// 1) 직접 만들어 사용하는 방법 : 팀원들이 서로 알기 편함
// 2) 자바에서 만들어 놓은 함수형 인터페이스: 외워서 각 패턴에 맞게 사용해야 해서 오히려 불편함
//   => 예) (1) void score() 함수    : Consumer<Integer>  
//   =>     (2) int score() 함수     : Supplier<Integer>
//   =>     (3) int score(int) 함수  : Function<Integer, Integer>

@FunctionalInterface
interface MyHistory {
	int score(int s);
}

public class S3_RamdaApplication {
	public static void main(String[] args) {
		MyHistory m = new MyHistory() {
			@Override
			public int score(int s) {
				return s;
			}
		};
		System.out.println(m.score(80));
		
		MyHistory m2 = (s) -> s;
		System.out.println(m2.score(80));
	}
}