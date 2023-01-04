package chatBotWithJava;

import java.util.Scanner;

public class FactorialInJava {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
