package chap16.section01.example04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadApplication {
    public static void main(String[] args) throws Exception {
        InputStream inputStream
                = new FileInputStream("src/chap16/output/test2.db");

        byte[] space = new byte[100];

        while (true) {
        	// 읽은 글자를 space 에 저장하고 읽은 개수를 num 에 저장함
            int num = inputStream.read(space); 

            if(num == -1) break;

            for (int i = 0; i < num; i++) {
                System.out.println(space[i]);
            }
        }
        inputStream.close(); 
    }
}