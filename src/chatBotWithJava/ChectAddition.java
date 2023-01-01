package chatBotWithJava;

import java.util.Scanner;

public class ChectAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean checkIsSumTwenty = (((num1 + num2 == 20) || (num2 + num3 == 20)) || (num1 + num3 == 20));

        System.out.println(checkIsSumTwenty);
    }
}
