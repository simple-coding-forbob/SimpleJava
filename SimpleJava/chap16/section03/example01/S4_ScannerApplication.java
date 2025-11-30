package chap16.section03.example01;

import java.util.Scanner;

public class S4_ScannerApplication {
    public static void main(String[] args) {

        Scanner scanner
                = new Scanner(System.in);

        String str = scanner.next();        
        System.out.println(str);
    }
}