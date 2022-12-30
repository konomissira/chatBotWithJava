package chatBotWithJava;

import java.util.Scanner;

public class SquirelsFoundNuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //N squirrels
        System.out.println("Type number of squirrels");
        int squirrels = scanner.nextInt();
        //N nuts
        System.out.println("Type number of nuts");
        int nuts = scanner.nextInt();
        //how many nuts each squirrel will get
        int nutBySquirrel = nuts / squirrels;
        System.out.println("Each squirrels will get " + nutBySquirrel + "!");
    }
}
