package chap16.section01.example09;

import java.io.FileReader;
import java.io.Reader;

public class ReadApplication {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("src/chap16/output/test4.txt");

		char[] space = new char[100];

		while (true) {
			// 최대 100문자씩 읽기서 space 저장, num 에는 글자 읽은 개수 저
			int num = reader.read(space);

			if (num == -1)
				break;

			for (int i = 0; i < num; i++) {
				System.out.println(space[i]);
			}
		}
		reader.close();
	}
}
