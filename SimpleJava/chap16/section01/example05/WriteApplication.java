package chap16.section01.example05;

import java.io.FileWriter;
import java.io.Writer;

public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일 쓰기용 열기
        Writer writer
                    = new FileWriter("src/chap16/output/test3.txt");

        char a = 'A';
        char b = 'B';

//        한문자씩 버퍼에 쓰기
        writer.write(a);
        writer.write(b);
//        진짜 파일에 쓰기
        writer.flush();
//        파일 닫기
        writer.close();
    }
}
