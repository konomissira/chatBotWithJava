package chatBotWithJava;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int startIncl = scanner.nextInt();
        int endIncl = scanner.nextInt();
        for (int i = startIncl; i <= endIncl; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
