package chap15.section02.example01;

import java.util.Optional;

public class S2_OptionalApplication {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("a");
		System.out.println(optional.get());
	}
}