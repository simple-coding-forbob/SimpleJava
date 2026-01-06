package chap15.section02.example01;

import java.util.Optional;

public class S3_OptionalApplication {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		
	    optional.orElseThrow(()-> new NullPointerException("null 에러가 발생했습니다."));

	}
}