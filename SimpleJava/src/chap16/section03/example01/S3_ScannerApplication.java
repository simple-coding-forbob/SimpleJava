package chap16.section03.example01;

import java.util.Scanner;

public class S3_ScannerApplication {
    public static void main(String[] args) {

        Scanner scanner
                = new Scanner(System.in);

        double num = scanner.nextDouble(); 
        System.out.println(num);
    }
}