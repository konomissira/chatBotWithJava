package chatBotWithJava;

import java.util.Scanner;

public class ReplacingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        System.out.println(myString.replace("a", "b"));
    }
}
