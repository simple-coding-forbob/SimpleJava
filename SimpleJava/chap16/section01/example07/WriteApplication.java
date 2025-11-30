package chap16.section01.example07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteApplication {
    public static void main(String[] args) throws Exception {
        Writer writer
                = new FileWriter("src/chap16/output/test5.txt");

//        문자열
        String str = "AB";

        writer.write(str);  // 버퍼 쓰기
        writer.flush();     // 파일 쓰기
        writer.close();     // 파일 닫기
    }
}
