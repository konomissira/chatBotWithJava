package chatBotWithJava;

import java.util.Scanner;

public class ReadingFromTheScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
