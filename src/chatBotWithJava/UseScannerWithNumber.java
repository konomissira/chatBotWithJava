package chatBotWithJava;

import java.util.Scanner;

public class UseScannerWithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Types two integers!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();*/

        //int sum = a + b;
        System.out.println("Type an integer!");
        int n = scanner.nextInt();
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}
