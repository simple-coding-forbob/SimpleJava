package chap16.section01.example03;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadApplication {
    public static void main(String[] args) throws Exception {
        InputStream inputStream
                = new FileInputStream("src/chap16/output/test1.db");

//      파일읽기 : 1) 반복문 : 1byte 읽고 읽을 위치를 자동으로 이동시킴 
//               2) 읽을 것이 없으면(-1) 중단
//               3) 있으면 화면에 1byte 씩 표시
        while (true) {
            int data = inputStream.read(); // 읽은 값

//            읽을 것이 없으면 : -1 => 반복문 중단
            if(data == -1) break;
//            읽은 내용 화면 표
            System.out.println(data);
        }
//        파일 사용(읽기) 끝나면 닫기 
        inputStream.close();
    }
}
