package chatBotWithJava;

import java.util.Scanner;

public class IncrementDecremente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();

        System.out.println((--firstNumber) + " " + (--secondNumber) + " " + (--thirdNumber) + " " + (--fourthNumber));
    }
}
