package chatBotWithJava;

import java.util.Scanner;

public class PrintTheProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter an integer number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product = 1;
        for (int i = a; i < b; i++ ) {
            product *= i;
        }
        System.out.println(product);
    }
}
