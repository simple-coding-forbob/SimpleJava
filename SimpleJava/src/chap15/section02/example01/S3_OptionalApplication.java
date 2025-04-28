package chap15.section02.example01;

import java.util.Optional;

public class S3_OptionalApplication {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("a");
		
	    String str = optional.orElseThrow(()-> new NullPointerException("에러가 발생했습니다."));
	    System.out.println(str);
	}
}