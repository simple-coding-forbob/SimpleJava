package chap16.section03.example01;

import java.util.Scanner;

public class S5_ScannerApplication {
    public static void main(String[] args) {

        Scanner scanner
                = new Scanner(System.in);

        String str = scanner.nextLine();   
        System.out.println(str);
    }
}