package chap16.section02.example02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineApplication {
    public static void main(String[] args) throws Exception {
        Reader reader =
                new FileReader("src/chap16/output/test3.txt");

        BufferedReader bufferedReader
                = new BufferedReader(reader);

        while (true) {
            String data = bufferedReader.readLine();
//            파일끝 : null
            if(data == null) break;
//            화면 출력
            System.out.println(data);
        }
        bufferedReader.close();          
    }
}