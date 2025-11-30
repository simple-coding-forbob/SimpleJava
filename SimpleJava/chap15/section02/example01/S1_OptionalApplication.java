package chap15.section02.example01;

import java.util.Optional;

public class S1_OptionalApplication {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		
//		if(optional.isPresent()) {
//			System.out.println("처리");
//		}
		optional.ifPresent(x -> System.out.println(x));
	}
}