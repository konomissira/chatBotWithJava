package chatBotWithJava;

import java.util.Scanner;

public class CheckIsNumberPositive {

    public static void main(String[]args) {
        System.out.println("Enter an integer to check if it's positive or not");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        if (myNumber > 0) {
            System.out.println("YES " + myNumber + " is positive number!");
        } else {
            System.out.println("NO " + myNumber + " is not positive number!");
        }
    }
}
