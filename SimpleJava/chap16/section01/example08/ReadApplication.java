package chap16.section01.example08;

import java.io.FileReader;
import java.io.Reader;

public class ReadApplication {
    public static void main(String[] args) throws Exception {

        Reader reader
                = new FileReader("src/chap16/output/test4.txt");

        while (true) {
            int data = reader.read();        // 1문자씩 읽기(정수:아스키코드)
//            반복문 종료(파일끝 : -1)
            if(data == -1) break;
//            화면출력
            System.out.println((char) data); // 아스키코드(정수) -> 문자 변경
        }
        reader.close();                      // 파일 닫기
    }
}
