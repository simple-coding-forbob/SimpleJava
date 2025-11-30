package chap16.section01.example02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일 열기
        OutputStream outputStream
                = new FileOutputStream("src/chap16/output/test2.db");

//        배열
        byte[] arr = {10,20};

//        버퍼 쓰기
        outputStream.write(arr);

//        버퍼 -> 파일에 쓰기
        outputStream.flush();
//        파일 닫기
        outputStream.close();
    }
}
