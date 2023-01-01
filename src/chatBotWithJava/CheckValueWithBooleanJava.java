package chatBotWithJava;

import java.util.Scanner;

public class CheckValueWithBooleanJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber = scanner.nextInt();
        boolean checkMyNumber = (myNumber < 10) && (myNumber > 0);

        System.out.println(checkMyNumber);
    }
}
