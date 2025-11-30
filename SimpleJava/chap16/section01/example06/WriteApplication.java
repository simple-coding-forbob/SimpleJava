package chap16.section01.example06;

import java.io.FileWriter;
import java.io.Writer;

public class WriteApplication {
    public static void main(String[] args) throws Exception {
        Writer writer
                = new FileWriter("src/chap16/output/test4.txt");

        char[] array = {'A', 'B'};

        writer.write(array); // 버퍼에 쓰기
        writer.flush();      // 파일에 쓰기
        writer.close();      // 파일 닫기

    }
}
