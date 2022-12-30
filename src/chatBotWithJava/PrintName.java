package chatBotWithJava;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello! My name is Aid.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + "!");
    }
}
