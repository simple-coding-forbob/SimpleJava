package chap16.section03.example02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineApplication {
    public static void main(String[] args) throws Exception {

        Reader reader
                = new InputStreamReader(System.in);

        BufferedReader bufferedReader
                = new BufferedReader(reader);

        String str = bufferedReader.readLine(); // 1줄입력
        System.out.println(str);

        bufferedReader.close();                 // 닫기

    }
}
