package chap16.section02.example01;

import java.io.*;

public class UtfApplication {

    public static void main(String[] args) throws Exception {
//    	텍스트 파일을 UTF-8 인코딩해서 사용하기: Reader 는 그런 기능 없음
        FileInputStream fileInputStream =
                new FileInputStream("src/chap16/output/test3.txt");
        
        Reader reader = new InputStreamReader(fileInputStream, "UTF-8");
        
//      성능향상 배열 준비
	    char[] space = new char[100];
	    int num = reader.read(space);
	    reader.close(); // 파일 닫기

        System.out.println(space);    // 화면 출력
    }
}
