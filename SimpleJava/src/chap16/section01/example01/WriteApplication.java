package chap16.section01.example01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteApplication {
    public static void main(String[] args) throws Exception {
//      1) 파일 쓰기용으로 열기 : 그래이들(빌드) 프로젝트 기본 경로 : ./src
        OutputStream outputStream
                = new FileOutputStream("src/chap16/output/test1.db");

        byte a = 10; // 1byte
        byte b = 20;

        outputStream.write(a);   // 버퍼공간에 저장
        outputStream.write(b);   // 버퍼공간에 저장

//      파일 입출력 : 속도가 굉장히 느림
//        => 횟수를 줄이기 위해 버퍼라는 공간에 미리 넣어두고 한번에 출력함
        outputStream.flush();    // 이때 파일에 진짜 씀
//      사용 끝나면 파일 닫기
        outputStream.close();
    }
}