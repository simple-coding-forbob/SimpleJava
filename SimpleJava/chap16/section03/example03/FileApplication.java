package chap16.section03.example03;

import java.io.File;
import java.util.Arrays;

public class FileApplication {
    public static void main(String[] args) throws Exception {
        File folder = new File("src/chap16/result");
        folder.mkdir();
        
        File file = new File("src/chap16/result/file1.txt");
        file.createNewFile();

        File[] contents = folder.listFiles();
        System.out.println(Arrays.toString(contents));
    }
}
