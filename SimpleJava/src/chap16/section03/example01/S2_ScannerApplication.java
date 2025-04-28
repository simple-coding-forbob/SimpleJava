package chap16.section03.example01;

import java.util.Scanner;

public class S2_ScannerApplication {
    public static void main(String[] args) {

        Scanner scanner
                = new Scanner(System.in);
        long num = scanner.nextLong();    
        System.out.println(num);
    }
}