package chap16.section03.example01;

import java.util.Scanner;

public class S1_ScannerApplication {
    public static void main(String[] args) {

        Scanner scanner
                = new Scanner(System.in);

        int num = scanner.nextInt();       
        System.out.println(num);
    }
}